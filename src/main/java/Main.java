import com.sun.scenario.effect.Offset;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;

import java.time.OffsetDateTime;
import java.util.Objects;

import static model.Inventory.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("LoginScreen.fxml")));
        root.getStylesheets().add("stylesheet.css");
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Appointment appointment = new Appointment();
        appointment.setAppointment_ID(1);
        appointment.setTitle("Test Title");
        appointment.setDescription("Test Description");
        appointment.setLocation("Test Location");
        appointment.setType("Test Type");
        appointment.setStart(OffsetDateTime.parse("2021-08-07T00:00:00+00:00"));
        appointment.setEnd(OffsetDateTime.parse("2021-08-07T00:00:00+00:00"));
        appointment.setCreate_Date(OffsetDateTime.parse("2021-08-06T00:00:00+00:00"));
        appointment.setCreated_By("Test User");
        appointment.setLast_Update(OffsetDateTime.parse("2021-08-06T00:00:00+00:00"));
        appointment.setLast_Updated_By("Test User");
        appointment.setCustomer_ID(1);
        appointment.setContact_ID(1);
        appointment.setUser_ID((1));
        appointmentList.add(appointment);
        Contact contact = new Contact();
        contact.setContact_ID(1);
        contact.setContact_Name("Test");
        contact.setEmail("test@test.com");
        contactList.add(contact);
        Country country = new Country();
        country.setCountry_ID(1);
        country.setCountry("Test Country");
        country.setCreate_Date(OffsetDateTime.parse("2021-08-06T00:00:00+00:00"));
        country.setCreated_By("Test User");
        country.setLast_Update(OffsetDateTime.parse("2021-08-06T00:00:00+00:00"));
        country.setLast_Updated_By("Test User");
        countryList.add(country);
        Customer customer = new Customer();
        customer.setCustomer_ID(1);
        customer.setCustomer_Name("Test Customer");
        customer.setAddress("Test Address");
        customer.setPostal_Code("Test Postal Code");
        customer.setPhone("555-555-5555");
        customer.setCreate_Date(OffsetDateTime.parse("2021-08-06T00:00:00+00:00"));
        customer.setCreated_By("Test User");
        customer.setLast_Update(OffsetDateTime.parse("2021-08-06T00:00:00+00:00"));
        customer.setLast_Updated_By("Test User");
        customer.setDivision_ID(1);
        customerList.add(customer);
        First_Level_Division firstLevelDivision = new First_Level_Division();
        firstLevelDivision.setDivision_ID(1);
        firstLevelDivision.setDivision("Test Division");
        firstLevelDivision.setCreate_Date(OffsetDateTime.parse("2021-08-06T00:00:00+00:00"));
        firstLevelDivision.setCreated_By("Test User");
        firstLevelDivision.setLast_Update(OffsetDateTime.parse("2021-08-06T00:00:00+00:00"));
        firstLevelDivision.setLast_Updated_By("Test User");
        firstLevelDivision.setCOUNTRY_ID(1);
        first_level_divisionList.add(firstLevelDivision);
        User user = new User();
        user.setUser_ID(1);
        user.setUser_Name("Test User");
        user.setPassword("testpassword");
        user.setCreate_Date(OffsetDateTime.parse("2021-08-06T00:00:00+00:00"));
        user.setCreated_By("Admin");
        user.setLast_Update(OffsetDateTime.parse("2021-08-06T00:00:00+00:00"));
        user.setLast_Updated_By("Admin");
        userList.add(user);
        launch(args);
    }
}
