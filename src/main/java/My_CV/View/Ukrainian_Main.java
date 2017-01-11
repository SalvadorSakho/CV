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
 * Created by ${BIM} on 18.08.2016.
 */
public class Ukrainian_Main {

    public Parent getRootUkr() {
        return rootUkr;
    }

    public void setRootUkr(Parent rootUkr) {
        this.rootUkr = rootUkr;
    }

    public Stage getUkrStage() {
        return ukrStage;
    }

    public void setUkrStage(Stage ukrStage) {
        this.ukrStage = ukrStage;
    }

    private static Parent rootUkr;
    private static Stage ukrStage;
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


    public void setUkrStageMethod() {

        setUkrStage(new Stage());
        try {
            setRootUkr(FXMLLoader.load(getClass().getResource("/junior_Java_CV_Ukr.fxml")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        getRootUkr().setStyle("-fx-background-color: white");

        getUkrStage().setTitle("Сальвадор Сахо");
        getUkrStage().setScene(new Scene(getRootUkr(), 800, 600));

        ImageView startPhoto = (ImageView) getRootUkr().lookup("#myPhotos");
        Image myPhoto = new Image("myPic1.png");
        startPhoto.setImage(myPhoto);

        ImageView copyRight = (ImageView) getRootUkr().lookup("#copyRightimg");
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

        ((Pane) getRootUkr()).getChildren().addAll(infoPane);
        getUkrStage().setResizable(false);
        getUkrStage().show();
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

        address.setText("Україна, м.Київ, вул.Радунська 8/13");
        address.setLayoutX(45);
        address.setLayoutY(65);
        address.onContextMenuRequestedProperty();

        email.setText("Salvador.Sakho21@gmail.com");
        email.setLayoutX(45);
        email.setLayoutY(95);

        birth.setText("17 Вересеня 1990");
        birth.setLayoutX(45);
        birth.setLayoutY(130);

        nationality.setText("Національність: Українець");
        nationality.setLayoutX(45);
        nationality.setLayoutY(160);

        imageViewFirstGif = new ImageView("my_gif.gif");
        imageViewFirstGif.setFitWidth(250);
        imageViewFirstGif.setFitHeight(250);
        imageViewFirstGif.setLayoutX(50);
        imageViewFirstGif.setLayoutY(300);

        infoPane.getChildren().addAll(phoneNumber, imageViewPhone, address, imageViewAddress, email, imageViewEmail, birth, imageViewBirth, nationality, imageViewNationality);

        ((Pane) getRootUkr()).getChildren().addAll(infoPane, imageViewFirstGif);
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
                work1.setText("Досвід роботи\n\n".toUpperCase() +
                        "Червень 2016 - сьогоднішній день\n" +
                        "Асистент викладача\n".toUpperCase() +
                        "Центр практичного навчання програмуванню \"IT-centre\", Київ (Україна)\n" +
                        "•\tДопомога в підготовці навчальних матеріалів\n" +
                        "•\tСтворення зразкі коду для занять\n" +
                        "•\tДопомога студентам під час занять\n");
                infoPane.getChildren().addAll(work1);
            }
            if (i == 1) {
                work1 = new Text();
                work1.setLayoutX(1);
                work1.setLayoutY(150);
                work1.setWrappingWidth(450);
                work1.setText("Жовтень 2014 - сьогоднішній день\n" +
                        "Головний спеціаліст відділу ІТ-рішень\n".toUpperCase() +
                        "Група компаній УКГ (\"УКГ Фінанс\"), Київ (Україна)\n" +
                        "•\tРозробка і впровадження програмного забезпечення в компанії\n" +
                        "•\tУчасть в розробці структури бази даних\n" +
                        "•\tТехнічна підтримка програмного забезпечення: управління правами доступу, моніторинг, налагодження програм, підтримка користувачів, тестування продукту;\n" +
                        "•\tЗабезпечення стабільного функціонування БД;\n" +
                        "•\tРозробка і оптимізація звітів за допомогою SSRS інструментів;\n" +
                        "•\tРозробка і забезпечення відповідності документів в своїй сфері діяльності;\n");
                infoPane.getChildren().addAll(work1);
            }

            if (i == 2) {
                work1 = new Text();
                work1.setLayoutX(1);
                work1.setLayoutY(330);
                work1.setText("Січень 2013 –  Травень 2013\n" +
                        "Інвестиційний консультант\n".toUpperCase() +
                        "\"Aegon\" акціонерне товариство, Щецін (Польща)\n" +
                        "•\tРозрахунок економічної вигоди від проекту\n" +
                        "•\tПорівняльний аналіз можливих альтернатив проекту\n" +
                        "•\tПідготовка необхідної документації для презентації проекта\n" +
                        "•\tСупровід проекту протягом терміну його реалізації\n");
                infoPane.getChildren().addAll(work1);
            }
        }

        ((Pane) getRootUkr()).getChildren().addAll(infoPane, imageViewFirstGif);
    }

    public void showEducAndTrain(MenuButton edicandtrain) {
        edicandtrain.getItems().clear();

        ObservableList<CheckMenuItem> list = FXCollections.observableArrayList();
        CheckMenuItem item1 = new CheckMenuItem("Освіта");
        CheckMenuItem item2 = new CheckMenuItem("Тренінги");
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
                    work1.setText("Освіта\n\n".toUpperCase() +
                            "Жовтень 2011 –  Березня 2014\n" +
                            "International Business Study (IBS) (магістр)\n" +
                            "Західнопоморська школа бізнесу, Щецін (Польща)\n");
                    infoPane.getChildren().addAll(work1);
                }
                if (i == 1) {
                    work1 = new Text();
                    work1.setLayoutX(1);
                    work1.setLayoutY(100);
                    work1.setText("Вересень 2007 – Червень 2011\n" +
                            "Фінанси та Банківська справа (бакалавр)\n" +
                            "Національна Академія Статистики Обліку та Аудиту, Київ (Україна)\n");
                    infoPane.getChildren().addAll(work1);
                }
            }
            ((Pane) getRootUkr()).getChildren().addAll(infoPane, imageViewFirstGif);
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
            work1.setWrappingWidth(450);
            work1.setText(("Тренінги\n\n".toUpperCase() +
                    "\"Java (Розширений курс)\"").toUpperCase() + " Центр практичного навчання програмуванню \"IT-centre\", Київ (Україна) (2016)\n\n" +
                    "\"Java (ООП)\"".toUpperCase() + " Центр практичного навчання програмуванню \"IT-centre\", Київ (Україна) (2015)\n\n" +
                    "\"Адміністратор баз даних MS SQL\"".toUpperCase() + " Навчальний центр \"Контакт\"(2014)\n\n" +
                    "\"Бухгалтерські курси\"".toUpperCase() + " Навчальний центр \"Троєщина\" (2008)\n\n" +
                    "\"1C: Бухгалтерія 7.7\"".toUpperCase() + " Навчальний центр \"Троєщина\" (2008)"
            );
            infoPane.getChildren().addAll(work1);

            ((Pane) getRootUkr()).getChildren().addAll(infoPane, imageViewFirstGif);
        });
    }

    public void showAllSkills(MenuButton btnSkills) {
        btnSkills.getItems().clear();

        ObservableList<CheckMenuItem> list = FXCollections.observableArrayList();
        CheckMenuItem languages = new CheckMenuItem("Мови");
        CheckMenuItem comunicManagSkills = new CheckMenuItem("Комунікативні навички / Менеджерські навички");
        CheckMenuItem computer = new CheckMenuItem("Компютерні навички");
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
            work1.setText("Мови\n\n".toUpperCase() +
                    "Рідна мова: Українська\n" +
                    "Іноземні мови: Англійська -  Вище середнього\n" +
                    "                          Польська -  Вище середнього\n" +
                    "                          Російська -  Вільно володію");
            infoPane.getChildren().addAll(work1);
            ((Pane) getRootUkr()).getChildren().addAll(infoPane, imageViewFirstGif);
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
            work1.setText("Комунікативні навички \n\n".toUpperCase() +
                    "Добре розвинені комунікативні навички, накопичений в ході моєї роботи в якості страхового агента і інвестиційного консультанта, під час зустрічей з клієнтами, презентації продуктів і ділових переговорів.\n\n" +
                    "Організаційні / Менеджерські навички\n\n".toUpperCase() +
                    "Знайомі з концепцією управління часом і стресостійкості. Розуміння культурних особливостей і вміння будувати відносини з іншими людьми в мультикультурному середовищі.");
            infoPane.getChildren().addAll(work1);
            ((Pane) getRootUkr()).getChildren().addAll(infoPane, imageViewFirstGif);
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

            work1.setText("Компютерні навички\n\n".toUpperCase() +
                    "Досвідчений користувач ОС Windows, Linux, Mac.\n" +
                    "Упевнені знання:\n" +
                    "\t* Java: ООП, Дженерики, Колекції, Потоки, JDBC, JavaFX\n" +
                    "\t* Веб:HTML, JSP\n" +
                    "\t* Бази даних: MS SQL, Oracle SQL, MySQL (T-SQL,PL SQL,SSRS, технології:\n" +
                    "\t\tрезервного копіювання і відновлення, збережені процедура, тригери, функції)\n" +
                    "Знайомий з (на практиці):\n" +
                    "\t* Фреймворки: Maven, Spring, Hibernate\n" +
                    "\t* Веб: Ajax, Jquery, CSS, Servlet, Tomcat\n" +
                    "\t* Розподілена система керування версіями (DVCS): Git\n" +
                    "\n" +
                    "Програмне забезпечення:\n" +
                    "Досвідчений користувач: IntelliJ IDEA, Eclipse\n" +
                    "Досвідчений користувач графічних редакторів: GIMP,Paint\n" +
                    "Досвідчений користувач: EmEditor (регулярні вирази, і т.д.)\n" +
                    "Досвідчений користувач: MS Office ( Excel, Word, Outlook, Power Point)\n" +
                    "Середній рівень знань графічного редактора: Photoshop");
            infoPane.getChildren().addAll(work1);
            ((Pane) getRootUkr()).getChildren().addAll(infoPane, imageViewFirstGif);
        });
    }

    public void showLang(MenuButton btnLanguage) {
        btnLanguage.getItems().clear();

        ObservableList<CheckMenuItem> list = FXCollections.observableArrayList();
        CheckMenuItem eu = new CheckMenuItem("Англійська");

        list.addAll(eu);
        btnLanguage.getItems().addAll(list);

        eu.setOnAction(event -> {

            setUkrStage((Stage) getRootUkr().getScene().getWindow());
            getUkrStage().close();

            try {
                English_main cm = new English_main();
                cm.setEUStage();
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
    }

}
