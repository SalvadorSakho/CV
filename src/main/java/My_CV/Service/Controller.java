package main.java.My_CV.Service;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import main.java.My_CV.View.English_main;

/**
 * Created by ${BIM} on 16.08.2016.
 */
public class Controller {

    @FXML
    private Pane mainPain;

    @FXML
    private ImageView myPhotos;

    @FXML
    private RadioButton firstPhoto;

    @FXML
    private RadioButton seccondPhoto;

    @FXML
    private RadioButton thirdPhoto;

    @FXML
    private Button btnPersonalInformation;

    @FXML
    private Button btnWorkExperience;

    @FXML
    private MenuButton btnEducationAndTraining;

    @FXML
    private MenuButton btnSkills;

    @FXML
    private MenuButton btnLanguage;

    private English_main englishMain = new English_main();


    @FXML
    public void setFirstPic() {
        Image image = new Image("myPic1.png");
        myPhotos.setImage(image);
        firstPhoto.setSelected(true);
        seccondPhoto.setSelected(false);
        thirdPhoto.setSelected(false);
    }

    @FXML
    public void setSeccondPic() {
        Image image = new Image("myPic2.jpg");
        myPhotos.setImage(image);
        seccondPhoto.setSelected(true);
        firstPhoto.setSelected(false);
        thirdPhoto.setSelected(false);
    }

    @FXML
    public void setThirdPic() {
        Image image = new Image("myPic3.jpg");
        myPhotos.setImage(image);
        thirdPhoto.setSelected(true);
        firstPhoto.setSelected(false);
        seccondPhoto.setSelected(false);
    }

    @FXML
    public void showPersonalInfo() {
        englishMain.showPersonInfo();
    }

    @FXML
    public void showWorkExperience() {
        englishMain.showWorkExpInfo();
    }

    @FXML
    public void showEducationAndTrainings() {
        englishMain.showEducAndTrain(btnEducationAndTraining);
    }

    @FXML
    public void showSkills() {
        englishMain.showAllSkills(btnSkills);
    }

    @FXML
    public void chouseLanguage() {
        englishMain.showLang(btnLanguage);
    }


    public Pane getMainPain() {
        return mainPain;
    }

    public void setMainPain(Pane mainPain) {
        this.mainPain = mainPain;
    }

    public ImageView getMyPhotos() {
        return myPhotos;
    }

    public void setMyPhotos(ImageView myPhotos) {
        this.myPhotos = myPhotos;
    }

    public RadioButton getFirstPhoto() {
        return firstPhoto;
    }

    public void setFirstPhoto(RadioButton firstPhoto) {
        this.firstPhoto = firstPhoto;
    }

    public RadioButton getSeccondPhoto() {
        return seccondPhoto;
    }

    public void setSeccondPhoto(RadioButton seccondPhoto) {
        this.seccondPhoto = seccondPhoto;
    }

    public RadioButton getThirdPhoto() {
        return thirdPhoto;
    }

    public void setThirdPhoto(RadioButton thirdPhoto) {
        this.thirdPhoto = thirdPhoto;
    }

    public Button getBtnPersonalInformation() {
        return btnPersonalInformation;
    }

    public void setBtnPersonalInformation(Button btnPersonalInformation) {
        this.btnPersonalInformation = btnPersonalInformation;
    }

    public Button getBtnWorkExperience() {
        return btnWorkExperience;
    }

    public void setBtnWorkExperience(Button btnWorkExperience) {
        this.btnWorkExperience = btnWorkExperience;
    }

    public MenuButton getBtnEducationAndTraining() {
        return btnEducationAndTraining;
    }

    public void setBtnEducationAndTraining(MenuButton btnEducationAndTraining) {
        this.btnEducationAndTraining = btnEducationAndTraining;
    }

    public MenuButton getBtnSkills() {
        return btnSkills;
    }

    public void setBtnSkills(MenuButton btnSkills) {
        this.btnSkills = btnSkills;
    }

    public MenuButton getBtnLanguage() {
        return btnLanguage;
    }

    public void setBtnLanguage(MenuButton btnLanguage) {
        this.btnLanguage = btnLanguage;
    }

    public English_main getEnglishMain() {
        return englishMain;
    }

    public void setEnglishMain(English_main englishMain) {
        this.englishMain = englishMain;
    }
}
