package p.proyectoversionfinalgabrielguzmanyluisguzman;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Login {
    private Stage stage;
    private Scene scene;
    private Parent root;



    @FXML
    private void registrarButton(Event event) throws IOException{
        JSONObject obj = new JSONObject();
        JSONArray jrr = new JSONArray();
        JSONParser jp = new JSONParser();
        TextField User_TextField = new TextField();
        TextField Pass_TextField2 = new TextField();
        try{
            FileReader file = new FileReader("UserData.json");
            jrr=(JSONArray)jp.parse(file);
        }catch(Exception ex){
            System.out.println("Error Ocurred");
        }

        obj.put("Username", User_TextField.getText());
        obj.put("Password",Pass_TextField2.getText());
        jrr.add(obj);
        try{
            FileWriter file = new FileWriter("UserData.json");
            file.write(jrr.toJSONString());
            file.close();
        }catch(Exception ex){
            System.out.println("Error Ocurred");
        }
        System.out.println("Data Saved");
    }

    @FXML
    private void ingresarButton(ActionEvent event) throws IOException {//GEN-FIRST:event_jButton1ActionPerformed
        JSONArray jrr = new JSONArray();
        Object ob = null;
        JSONParser Jp = new JSONParser();
        TextField User_TextField = new TextField();
        TextField Pass_TextField2 = new TextField();
        //fetch file--
        try{
            FileReader file = new FileReader("UserData.json");
            ob=Jp.parse(file);
            jrr=(JSONArray) ob;
            file.close();
        }catch(Exception ex){
            System.out.println("Error Occured While fetching");
        }

        JSONObject obj = new JSONObject();
        int size = jrr.size();
        obj.put("Username", User_TextField.getText());
        obj.put("Password",Pass_TextField2.getText());

        for(int i=0;i<size;i++){
            if(obj.equals(jrr.get(i))){
                System.out.println("Password matched");
                Parent root = FXMLLoader.load(getClass().getResource("bibliotecas.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

                break;
            }else if(i==size-1){
                System.out.println("Incorrect User/Password!");
            }
        }
    }

    @FXML
    private void deleteButton(ActionEvent event) throws IOException{
        JSONArray jrr = new JSONArray();
        Object ob = null;
        JSONParser Jp = new JSONParser();
        TextField User_TextField = new TextField();
        TextField Pass_TextField2 = new TextField();
        //fetch file--
        try{
            FileReader file = new FileReader("UserData.json");
            ob=Jp.parse(file);
            jrr=(JSONArray) ob;
            file.close();
        }catch(Exception ex){
            System.out.println("Error Occured While fetching");
        }

        JSONObject obj = new JSONObject();
        int size = jrr.size();
        obj.put("Username", User_TextField.getText());
        obj.put("Password",Pass_TextField2.getText());

        for(int i=0;i<size;i++){
            if(obj.equals(jrr.get(i))){
                try{
                    FileWriter file = new FileWriter("UserData.json");
                    jrr.remove(i);
                    file.write(jrr.toJSONString());
                    file.close();
                }catch(Exception ex){
                    System.out.println("Error occured");
                }
                System.out.println("Data Removed");
                break;
            }else if(i==size-1){
                System.out.println("Incorrect User/Password!");
            }
        }
    }

    @FXML
    private void salirButton(ActionEvent event) throws IOException{
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.close();
    }


}

