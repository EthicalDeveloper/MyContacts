package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.StringConverter;
import sample.datamodel.Contact;

import java.time.LocalDate;


public class ContactController {

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField phoneNumberField;

    @FXML
    private TextField emailField;

//    @FXML
//    private DatePicker birthdayDatePicker;

    @FXML
    private TextField notesField;

//    @FXML
//    private ToggleGroup infoContactGroup;

    public Contact getNewContact(){
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String phoneNumber = phoneNumberField.getText();
        String email = emailField.getText();
        String notes = notesField.getText();
//        RadioButton selectedRadioButton = (RadioButton) infoContactGroup.getSelectedToggle();
//        String toggleGroupValue = selectedRadioButton.getText();


        Contact newContact = new Contact(firstName,lastName,phoneNumber,email,notes);
        return newContact;
    }

    public void editContact(Contact contact){
        firstNameField.setText(contact.getFirstName());
        lastNameField.setText(contact.getLastName());
        phoneNumberField.setText(contact.getPhoneNumber());
        emailField.setText(contact.getEmail());
        notesField.setText(contact.getNotes());
    }

    public void updateContact(Contact contact){
        contact.setFirstName(firstNameField.getText());
        contact.setLastName(lastNameField.getText());
        contact.setPhoneNumber(phoneNumberField.getText());
        contact.setEmail(emailField.getText());
        contact.setNotes(notesField.getText());
    }



}
