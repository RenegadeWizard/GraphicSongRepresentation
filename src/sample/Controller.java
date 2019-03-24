package sample;

import javafx.scene.control.Button;

public class Controller {
    public Button refresh;
    public Button day;
    public Button fav;
    public Button sett;

    private void setClicked(Button button){
        button.getStyleClass().add("clickedButton");
    }

    private void setNotClicked(Button button){
        button.getStyleClass().removeAll("clickedButton");
    }

    public void refreshPage(){

    }

    public void dayButton(){
        setClicked(day);
        setNotClicked(fav);
        setNotClicked(sett);
    }

    public void favoriteButton(){
        setClicked(fav);
        setNotClicked(day);
        setNotClicked(sett);
    }

    public void settingsButton(){
        setClicked(sett);
        setNotClicked(day);
        setNotClicked(fav);
    }

}
