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

        Appointment appointment = new Appointment(1,"Test Title","Test Description","Test Location","Test Type", new DateTime(OffsetDateTime.parse("2021-08-07T00:00:00-07:00")), new DateTime(OffsetDateTime.parse("2021-08-07T00:00:00-07:00")), createDate, createdBy,lastUpdate,lastUpdatedBy,1,1,1);
        appointmentList.add(appointment);
    }

    private static void addTestContact() {
        Contact contact = new Contact(1,"Test","test@test.com");
        contactList.add(contact);
    }

    private static void addTestCountry() {
        Country country = new Country(1,"Test Country",createDate,createdBy,lastUpdate,lastUpdatedBy);
        countryList.add(country);
    }

    private static void addTestCustomer() {
        Customer customer = new Customer(1,"Test Customer","Test Address","Test Postal Code","555-555-5555",createDate,createdBy,lastUpdate, lastUpdatedBy,1,"Test Country");
        customerList.add(customer);
    }

    private static void addTestFirstLevelDivision() {
        First_Level_Division firstLevelDivision = new First_Level_Division(1,"Test Division",createDate,createdBy,lastUpdate,lastUpdatedBy,1);
        first_level_divisionList.add(firstLevelDivision);
    }

    private static void addTestUser() {
        User user = new User(1,"Test User","testpassword",createDate,"admin",lastUpdate,"admin");
        userList.add(user);
    }
}
