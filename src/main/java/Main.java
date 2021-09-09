import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.zone.ZoneRules;
import java.util.Objects;
import java.util.TimeZone;

import static model.DateTime.convertTimeZone;
import static model.Inventory.*;

public class Main extends Application {
    
    static DateTime createDate = new DateTime(OffsetDateTime.parse("2021-08-06T00:00:00+00:00"));
    static String createdBy = "Test User";
    static DateTime lastUpdate = new DateTime(OffsetDateTime.parse("2021-08-06T00:00:00+00:00"));
    static String lastUpdatedBy = "Test User";

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("LoginScreen.fxml")));
        root.getStylesheets().add("stylesheet.css");
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        addTestItemsToList();
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println("Time Zone: " + timeZone.getDisplayName() + "\nRaw Offset: " + timeZone.getRawOffset()/3600000 + "\nDaylight Savings Time Offset: " + timeZone.getDSTSavings()/3600000);
        System.out.println(ZoneOffset.systemDefault());
        ZoneId zoneId = ZoneId.systemDefault();
        OffsetDateTime test = OffsetDateTime.ofInstant(Instant.now(),ZoneOffset.systemDefault());
        System.out.println(zoneId.getRules().getOffset(LocalDateTime.now()));
        System.out.println(zoneId.getRules().getOffset(LocalDateTime.now()));
        System.out.println(((Appointment)appointmentList.getList().get(0)).getStart());
        System.out.println(convertTimeZone(((Appointment)appointmentList.getList().get(0)).getStart()));
        System.out.println();
        launch(args);
    }
//    private static void initiateTables() {
//        AppointmentTable appointmentTable = new AppointmentTable();
//    }




    private static void addTestItemsToList() {
        addTestAppointment();
        addTestContact();
        addTestCountry();
        addTestCustomer();
        addTestFirstLevelDivision();
        addTestUser();
    }

    private static void addTestAppointment() {

        Appointment appointment1 = new Appointment(1,"Test Title 1","Test Description 1","Test Location 1","Test Type 1", new DateTime(OffsetDateTime.parse("2011-08-07T00:00:00-07:00")), new DateTime(OffsetDateTime.parse("2011-08-07T00:00:00-07:00")), createDate, createdBy,lastUpdate,lastUpdatedBy,1,1,1);
        Appointment appointment2 = new Appointment(2,"Test Title 2","Test Description 2","Test Location 2","Test Type 2", new DateTime(OffsetDateTime.parse("2022-08-07T00:00:00-07:00")), new DateTime(OffsetDateTime.parse("2022-08-07T00:00:00-07:00")), createDate, createdBy,lastUpdate,lastUpdatedBy,2,2,2);
        appointmentList.addAll(appointment1, appointment2);
    }

    private static void addTestContact() {
        Contact contact1 = new Contact(1,"Test 1","test1@test.com");
        Contact contact2 = new Contact(2,"Test 2","test2@test.com");
        contactList.addAll(contact1, contact2);
    }

    private static void addTestCountry() {
        Country country1 = new Country(1,"Test Country 1",createDate,createdBy,lastUpdate,lastUpdatedBy);
        Country country2 = new Country(2,"Test Country 2",createDate,createdBy,lastUpdate,lastUpdatedBy);
        countryList.addAll(country1, country2);
    }

    private static void addTestCustomer() {
        Customer customer1 = new Customer(1,"Test Customer 1","Test Address 1","Test Postal Code 1","111-111-1111",createDate,createdBy,lastUpdate, lastUpdatedBy,1,"Test Country 1");
        Customer customer2 = new Customer(2,"Test Customer 2","Test Address 2","Test Postal Code 2","222-222-2222",createDate,createdBy,lastUpdate, lastUpdatedBy,2,"Test Country 2");
        customerList.addAll(customer1, customer2);
    }

    private static void addTestFirstLevelDivision() {
        First_Level_Division firstLevelDivision1 = new First_Level_Division(1,"Test Division 1",createDate,createdBy,lastUpdate,lastUpdatedBy,1);
        First_Level_Division firstLevelDivision2 = new First_Level_Division(2,"Test Division 2",createDate,createdBy,lastUpdate,lastUpdatedBy,2);
        first_level_divisionList.addAll(firstLevelDivision1, firstLevelDivision2);
    }

    private static void addTestUser() {
        User user1 = new User(1,"Test User 1","testpassword1",createDate,"admin",lastUpdate,"admin");
        User user2 = new User(2,"Test User 2","testpassword2",createDate,"admin",lastUpdate,"admin");
        userList.addAll(user1, user2);
    }
}
