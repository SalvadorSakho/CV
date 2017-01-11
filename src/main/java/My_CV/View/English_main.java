package main.java.My_CV.View;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;


/**
 * Created by ${BIM} on 16.08.2016.
 */
public class English_main {

    public Stage getUkStage() {
        return ukStage;
    }

    public void setUkStage(Stage ukStage) {
        this.ukStage = ukStage;
    }

    public Parent getRootUK() {
        return rootUK;
    }

    public void setRootUK(Parent rootUK) {
        this.rootUK = rootUK;
    }

    private static Parent rootUK;
    private static Stage ukStage;
    private static Pane infoPane;
    private static Text phoneNumber;
    private static Text address;
    private static Text email;
    private static Text work1;
    private static Text birth;
    private static Text nationality;
    private static Image myPhone;
    private static Image myAddress;
    private static Image myEmail;
    private static Image myBirth;
    private static Image myNationality;
    private static ImageView imageViewPhone;
    private static ImageView imageViewAddress;
    private static ImageView imageViewEmail;
    private static ImageView imageViewBirth;
    private static ImageView imageViewNationality;
    private static ImageView imageViewFirstGif;


    public void setEUStage() {
        try {
            setRootUK(FXMLLoader.load(getClass().getResource("/junior_Java_CV.fxml")));

        } catch (IOException e) {
            e.printStackTrace();
        }
        getRootUK().setStyle("-fx-background-color: white");

        setUkStage(new Stage());
        getUkStage().setScene(new Scene(getRootUK(), 800, 600));
        getUkStage().setTitle("Salvador Sakho");


        ImageView startPhoto = (ImageView) getRootUK().lookup("#myPhotos");
        Image myPhoto = new Image("myPic1.png");
        startPhoto.setImage(myPhoto);

        ImageView copyRight = (ImageView) getRootUK().lookup("#copyRightimg");
        Image copyRightImg = new Image("copyright.png");
        copyRight.setImage(copyRightImg);

        infoPane = new Pane();
        infoPane.setLayoutX(400);
        infoPane.setLayoutY(100);
        infoPane.setPrefWidth(300);
        infoPane.setPrefHeight(95);

        imageViewFirstGif = new ImageView("my_gif.gif");
        imageViewFirstGif.setFitWidth(250);
        imageViewFirstGif.setFitHeight(250);
        infoPane.getChildren().addAll(imageViewFirstGif);

        ((Pane) getRootUK()).getChildren().addAll(infoPane);
        getUkStage().setResizable(false);
        getUkStage().show();
    }

    public void showPersonInfo() {

        if (infoPane != null) {
            infoPane.getChildren().clear();
            infoPane = null;
        }

        infoPane = new Pane();
        phoneNumber = new Text();
        address = new Text();
        email = new Text();
        birth = new Text();
        nationality = new Text();
        myPhone = new Image("my_Phone.png");
        myAddress = new Image("my_Home.png");
        myEmail = new Image("email.png");
        myBirth = new Image("birth.png");
        myNationality = new Image("flag.png");
        imageViewPhone = new ImageView();
        imageViewAddress = new ImageView();
        imageViewEmail = new ImageView();
        imageViewBirth = new ImageView();
        imageViewNationality = new ImageView();

        infoPane.setLayoutX(340);
        infoPane.setLayoutY(95);
        infoPane.setPrefWidth(300);
        infoPane.prefHeight(95);

        imageViewPhone.setFitWidth(25);
        imageViewPhone.setFitHeight(25);
        imageViewPhone.setLayoutX(10);
        imageViewPhone.setLayoutY(10);
        imageViewPhone.setImage(myPhone);


        imageViewAddress.setFitWidth(25);
        imageViewAddress.setFitHeight(25);
        imageViewAddress.setLayoutX(10);
        imageViewAddress.setLayoutY(45);
        imageViewAddress.setImage(myAddress);

        imageViewEmail.setFitWidth(25);
        imageViewEmail.setFitHeight(25);
        imageViewEmail.setLayoutX(10);
        imageViewEmail.setLayoutY(75);
        imageViewEmail.setImage(myEmail);

        imageViewBirth.setFitHeight(25);
        imageViewBirth.setFitWidth(25);
        imageViewBirth.setLayoutX(10);
        imageViewBirth.setLayoutY(110);
        imageViewBirth.setImage(myBirth);

        imageViewNationality.setFitHeight(25);
        imageViewNationality.setFitWidth(25);
        imageViewNationality.setLayoutX(10);
        imageViewNationality.setLayoutY(145);
        imageViewNationality.setImage(myNationality);

        phoneNumber.setText("380633530621");
        phoneNumber.setLayoutX(45);
        phoneNumber.setLayoutY(30);

        address.setText("8/13 Str. Radunska, 02232 Kiev (Ukraine)");
        address.setLayoutX(45);
        address.setLayoutY(65);
        address.onContextMenuRequestedProperty();

        email.setText("Salvador.Sakho21@gmail.com");
        email.setLayoutX(45);
        email.setLayoutY(95);

        birth.setText("17 October 1990");
        birth.setLayoutX(45);
        birth.setLayoutY(130);

        nationality.setText("Nationality: Ukrainian");
        nationality.setLayoutX(45);
        nationality.setLayoutY(160);

        imageViewFirstGif = new ImageView("my_gif.gif");
        imageViewFirstGif.setFitWidth(250);
        imageViewFirstGif.setFitHeight(250);
        imageViewFirstGif.setLayoutX(50);
        imageViewFirstGif.setLayoutY(300);

   /*   final Clipboard clipboard= new Clipboard.getSystemClipboard();
        final ClipboardContent content = new ClipboardContent();*/

        infoPane.getChildren().addAll(phoneNumber, imageViewPhone, address, imageViewAddress, email, imageViewEmail, birth, imageViewBirth, nationality, imageViewNationality);

        ((Pane) getRootUK()).getChildren().addAll(infoPane, imageViewFirstGif);
    }


    public void showWorkExpInfo() {

        if (infoPane != null) {
            infoPane.getChildren().clear();
            infoPane = null;
        }

        infoPane = new Pane();
        infoPane.setLayoutX(340);
        infoPane.setLayoutY(100);
        infoPane.setPrefWidth(300);
        infoPane.prefHeight(95);

        imageViewFirstGif = new ImageView("my_gif.gif");
        imageViewFirstGif.setFitWidth(250);
        imageViewFirstGif.setFitHeight(250);
        imageViewFirstGif.setLayoutX(50);
        imageViewFirstGif.setLayoutY(300);

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                work1 = new Text();
                work1.setLayoutX(1);
                work1.setLayoutY(15);
                work1.setText("Work Experience\n\n".toUpperCase() +
                        "June 2016 - nowadays\n" +
                        "Teacher assistant\n".toUpperCase() +
                        "Practical center of programming \"IT-centre\", Kiev (Ukraine)\n" +
                        "•\tAssistance in collection of educational materials\n" +
                        "•\tCreating code examples\n" +
                        "•\tSupport of students during the lessons\n");
                infoPane.getChildren().addAll(work1);
            }
            if (i == 1) {
                work1 = new Text();
                work1.setLayoutX(1);
                work1.setLayoutY(150);
                work1.setWrappingWidth(450);
                work1.setText("October 2014 - nowadays\n" +
                        "Main specialist of IT-solution department\n".toUpperCase() +
                        "Companies group UCG (\"UCG Finance\"), Kiev (Ukraine)\n" +
                        "•\tDevelopment and introduction of the software within the company\n" +
                        "•\tParticipation in the development of database structures\n" +
                        "•\tTechnical software support: access rights management, monitoring, providing the evaluation and program debug, users support, product testing;\n" +
                        "•\tProviding the functionality of database;\n" +
                        "•\tDeveloping and optimization of reports using the SSRS tools;\n" +
                        "•\tDevelopment and providing relevance of documents in their field of activity;\n");
                infoPane.getChildren().addAll(work1);
            }

            if (i == 2) {
                work1 = new Text();
                work1.setLayoutX(1);
                work1.setLayoutY(320);
                work1.setText("January 2013 –  May 2013\n" +
                        "Investment adviser\n".toUpperCase() +
                        "\"Aegon\" joint-stock company, Szczecin (Poland)\n" +
                        "•\tCalculation of economic benefit from the project\n" +
                        "•\tComparative analysis of possible project alternatives\n" +
                        "•\tPreparation of the necessary documentation for the project presentation\n" +
                        "•\tSupporting the project during its implementation period\n");
                infoPane.getChildren().addAll(work1);
            }
        }

        ((Pane) getRootUK()).getChildren().addAll(infoPane, imageViewFirstGif);
    }

    public void showEducAndTrain(MenuButton edicandtrain) {
        edicandtrain.getItems().clear();


        ObservableList<CheckMenuItem> list = FXCollections.observableArrayList();
        CheckMenuItem item1 = new CheckMenuItem("Education");
        CheckMenuItem item2 = new CheckMenuItem("Trainings");
        list.addAll(item1, item2);
        edicandtrain.getItems().addAll(list);

        item1.setOnAction(event -> {
            imageViewFirstGif = new ImageView("my_gif.gif");
            imageViewFirstGif.setFitWidth(250);
            imageViewFirstGif.setFitHeight(250);
            imageViewFirstGif.setLayoutX(50);
            imageViewFirstGif.setLayoutY(300);

            if (infoPane != null) {
                infoPane.getChildren().clear();
                infoPane = null;
            }
            infoPane = new Pane();
            infoPane.setLayoutX(340);
            infoPane.setLayoutY(100);
            infoPane.setPrefWidth(300);
            infoPane.prefHeight(95);

            for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    work1 = new Text();
                    work1.setLayoutX(1);
                    work1.setLayoutY(15);
                    work1.setText("Education\n\n".toUpperCase() +
                            "October 2011 –  March 2014\n" +
                            "International Business Study (IBS) (magister)\n" +
                            "West Pomeranian Business School, Szczecin (Poland)\n");
                    infoPane.getChildren().addAll(work1);
                }
                if (i == 1) {
                    work1 = new Text();
                    work1.setLayoutX(1);
                    work1.setLayoutY(100);
                    work1.setText("September 2007 – June 2011\n" +
                            "Finance and Banking (bachelor)\n" +
                            "National Academy Statistics Accounting and Auditing, Kiev (Ukraine)\n");
                    infoPane.getChildren().addAll(work1);
                }
            }
            ((Pane) getRootUK()).getChildren().addAll(infoPane, imageViewFirstGif);
        });

        item2.setOnAction(event -> {
            imageViewFirstGif = new ImageView("my_gif.gif");
            imageViewFirstGif.setFitWidth(250);
            imageViewFirstGif.setFitHeight(250);
            imageViewFirstGif.setLayoutX(50);
            imageViewFirstGif.setLayoutY(300);

            if (infoPane != null) {
                infoPane.getChildren().clear();
                infoPane = null;
            }
            infoPane = new Pane();
            infoPane.setLayoutX(340);
            infoPane.setLayoutY(100);
            infoPane.setPrefWidth(300);
            infoPane.prefHeight(95);

            work1 = new Text();
            work1.setLayoutX(1);
            work1.setLayoutY(15);
            work1.setText(("Courses\n\n".toUpperCase() +
                    "\"Java (Advanced course)\"").toUpperCase() + " Practical center of programming \"IT-centre\" (2016)\n\n" +
                    "\"Java (OOP)\"".toUpperCase() + " Practical center of programming \"IT-centre\" (2015)\n\n" +
                    "\"Administrator of MS SQL\"".toUpperCase() + " Educational center \"Contact\"(2014)\n\n" +
                    "\"Accounting courses\"".toUpperCase() + " Educational center \"Troeschyna\" (2008)\n\n" +
                    "\"1C: Accounting 7.7\"".toUpperCase() + " Educational center \"Troeschyna\" (2008)"
            );
            infoPane.getChildren().addAll(work1);

            ((Pane) getRootUK()).getChildren().addAll(infoPane, imageViewFirstGif);
        });
    }

    public void showAllSkills(MenuButton btnSkills) {
        btnSkills.getItems().clear();

        ObservableList<CheckMenuItem> list = FXCollections.observableArrayList();
        CheckMenuItem languages = new CheckMenuItem("Languages");
        CheckMenuItem comunicManagSkills = new CheckMenuItem("Communication / Managerial skills");
        CheckMenuItem computer = new CheckMenuItem("Computer skills");
        list.addAll(languages, comunicManagSkills, computer);
        btnSkills.getItems().addAll(list);

        languages.setOnAction(event -> {

            imageViewFirstGif = new ImageView("my_gif.gif");
            imageViewFirstGif.setFitWidth(250);
            imageViewFirstGif.setFitHeight(250);
            imageViewFirstGif.setLayoutX(50);
            imageViewFirstGif.setLayoutY(300);

            if (infoPane != null) {
                infoPane.getChildren().clear();
                infoPane = null;
            }
            infoPane = new Pane();
            infoPane.setLayoutX(340);
            infoPane.setLayoutY(100);
            infoPane.setPrefWidth(300);
            infoPane.prefHeight(95);

            work1 = new Text();
            work1.setLayoutX(1);
            work1.setLayoutY(15);
            work1.setText("Languages\n\n".toUpperCase() +
                    "Mother tongue: Ukrainian\n" +
                    "Foreign languages: English -  Upper-Intermediate\n" +
                    "                                Polish   -  Upper-Intermediate\n" +
                    "                                Russian -  Advanced");
            infoPane.getChildren().addAll(work1);
            ((Pane) getRootUK()).getChildren().addAll(infoPane, imageViewFirstGif);
        });

        comunicManagSkills.setOnAction(event -> {

            imageViewFirstGif = new ImageView("my_gif.gif");
            imageViewFirstGif.setFitWidth(250);
            imageViewFirstGif.setFitHeight(250);
            imageViewFirstGif.setLayoutX(50);
            imageViewFirstGif.setLayoutY(300);

            if (infoPane != null) {
                infoPane.getChildren().clear();
                infoPane = null;
            }

            infoPane = new Pane();
            infoPane.setLayoutX(340);
            infoPane.setLayoutY(100);
            infoPane.setPrefWidth(300);
            infoPane.prefHeight(95);

            work1 = new Text();
            work1.setLayoutX(1);
            work1.setLayoutY(15);
            work1.setWrappingWidth(450);
            work1.setText("Communication skills\n\n".toUpperCase() +
                    "Good communication skills gained through my work, as insurance agent and  investment adviser, during meetings with clients,  presentations of products and business negotiations.\n\n" +
                    "Organisational / managerial skills\n\n".toUpperCase() +
                    "Familiar with the concept of time management and stress resistance.  Understanding of cultural features and ability to build relationships with other persons in a multicultural environment.");
            infoPane.getChildren().addAll(work1);
            ((Pane) getRootUK()).getChildren().addAll(infoPane, imageViewFirstGif);
        });

        computer.setOnAction(event -> {

            imageViewFirstGif = new ImageView("my_gif.gif");
            imageViewFirstGif.setFitWidth(250);
            imageViewFirstGif.setFitHeight(250);
            imageViewFirstGif.setLayoutX(50);
            imageViewFirstGif.setLayoutY(300);

            if (infoPane != null) {
                infoPane.getChildren().clear();
                infoPane = null;
            }

            infoPane = new Pane();
            infoPane.setLayoutX(340);
            infoPane.setLayoutY(100);
            infoPane.setPrefWidth(300);
            infoPane.prefHeight(95);

            work1 = new Text();
            work1.setLayoutX(1);
            work1.setLayoutY(15);
            work1.setWrappingWidth(450);

            work1.setText("Computer skills\n\n".toUpperCase() +
                    "Advanced user  of  OS Windows, Linux, Mac.\n" +
                    "Strong knowledge of:\n" +
                    "\t* Java: OOP, Generics, Collections, Threads, JDBC, JavaFX\n" +
                    "\t* Web:HTML, JSP\n" +
                    "\t* Database: MS SQL, Oracle SQL, MySQL (T-SQL,PL SQL,SSRS, technologies of:\n" +
                    "\t\tbackup and recovery, stored procedure, triggers, function)\n" +
                    "Familiar with (on practice):\n" +
                    "\t* Frameworks: Maven, Spring, Hibernate\n" +
                    "\t* Web: Ajax, Jquery, CSS, Servlet, Tomcat\n" +
                    "\t* DVCS: Git\n" +
                    "\n" +
                    "Software:\n" +
                    "Advanced user IntelliJ IDEA, Eclipse\n" +
                    "Advanced user of Graphical editors: GIMP\n" +
                    "Advanced user of EmEditor (work with regular expressions, etc.)\n" +
                    "Advanced user of MS Office ( Excel, Word, Outlook, Power Point)\n" +
                    "Intermediate level of Graphical editors: Photoshop");
            infoPane.getChildren().addAll(work1);
            ((Pane) getRootUK()).getChildren().addAll(infoPane, imageViewFirstGif);
        });
    }

    public void showLang(MenuButton btnLanguage) {
        btnLanguage.getItems().clear();

        ObservableList<CheckMenuItem> list = FXCollections.observableArrayList();
        CheckMenuItem urk = new CheckMenuItem("Ukrainian");

        list.addAll(urk);
        btnLanguage.getItems().addAll(list);

        urk.setOnAction(event -> {

            setUkStage((Stage) getRootUK().getScene().getWindow());
            getUkStage().close();


            try {
                Ukrainian_Main um = new Ukrainian_Main();
                um.setUkrStageMethod();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
