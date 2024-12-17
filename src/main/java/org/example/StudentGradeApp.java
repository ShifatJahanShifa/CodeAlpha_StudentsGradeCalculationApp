package org.example;

//
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.layout.*;
//import javafx.stage.Stage;
//
//import com.itextpdf.text.*;
//import com.itextpdf.text.pdf.PdfWriter;
//
//import java.io.FileOutputStream;
//import java.util.ArrayList;
//import java.util.List;
//
//public class StudentGradeApp extends Application {
//
//    private TextField studentNameField, studentClassField, studentRollField, studentSectionField;
//    private VBox coursesContainer;
//    private List<Course> courses = new ArrayList<>();
//    private String reportContent = ""; // Store the report content globally
//
//    @Override
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("Student Grade Management App");
//
//        // Student Info Section
//        GridPane studentInfoGrid = new GridPane();
//        studentInfoGrid.setAlignment(Pos.CENTER); // Center align the grid
//        studentInfoGrid.setPadding(new Insets(10));
//        studentInfoGrid.setHgap(10);
//        studentInfoGrid.setVgap(10);
//
//        studentInfoGrid.add(new Label("Student Name:"), 0, 0);
//        studentNameField = new TextField();
//        studentInfoGrid.add(studentNameField, 1, 0);
//
//        studentInfoGrid.add(new Label("Class:"), 0, 1);
//        studentClassField = new TextField();
//        studentInfoGrid.add(studentClassField, 1, 1);
//
//        studentInfoGrid.add(new Label("Roll:"), 0, 2);
//        studentRollField = new TextField();
//        studentInfoGrid.add(studentRollField, 1, 2);
//
//        studentInfoGrid.add(new Label("Section:"), 0, 3);
//        studentSectionField = new TextField();
//        studentInfoGrid.add(studentSectionField, 1, 3);
//
//        // Course Section
//        Button addCourseButton = new Button("Add Course");
//        coursesContainer = new VBox(10);
//        coursesContainer.setAlignment(Pos.CENTER); // Center align the VBox
//        coursesContainer.setPadding(new Insets(10));
//        addCourseButton.setOnAction(e -> addCourseField());
//        coursesContainer.getChildren().add(addCourseButton);
//
//        // Generate Report and Download Report Buttons
//        Button generateReportButton = new Button("Generate Report");
//        generateReportButton.setOnAction(e -> generateReport());
//
//        Button downloadReportButton = new Button("Download Report");
//        downloadReportButton.setOnAction(e -> generatePDF());
//
//        HBox buttonBox = new HBox(15, generateReportButton, downloadReportButton);
//        buttonBox.setAlignment(Pos.CENTER);
//
//        // Main Layout
//        VBox mainLayout = new VBox(20);
//        mainLayout.setPadding(new Insets(20));
//        mainLayout.setAlignment(Pos.CENTER); // Center everything
//        mainLayout.getChildren().addAll(
//                new Label("Student Information"),
//                studentInfoGrid,
//                new Label("Courses and Grades"),
//                coursesContainer,
//                buttonBox
//        );
//
//        Scene scene = new Scene(mainLayout, 600, 500);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    // Add Course Input Fields
//    private void addCourseField() {
//        HBox courseBox = new HBox(10);
//        courseBox.setAlignment(Pos.CENTER);
//
//        TextField courseNameField = new TextField();
//        courseNameField.setPromptText("Course Name");
//
//        TextField gradeField = new TextField();
//        gradeField.setPromptText("Grade");
//
//        Button removeButton = new Button("Remove");
//        removeButton.setOnAction(e -> coursesContainer.getChildren().remove(courseBox));
//
//        courseBox.getChildren().addAll(courseNameField, gradeField, removeButton);
//        coursesContainer.getChildren().add(courseBox);
//    }
//
//    // Generate Report and Show Dialog
//    private void generateReport() {
//        String studentName = studentNameField.getText();
//        String studentClass = studentClassField.getText();
//        String studentRoll = studentRollField.getText();
//        String studentSection = studentSectionField.getText();
//
//        courses.clear();
//        for (int i = 1; i < coursesContainer.getChildren().size(); i++) {
//            HBox courseBox = (HBox) coursesContainer.getChildren().get(i);
//            TextField courseNameField = (TextField) courseBox.getChildren().get(0);
//            TextField gradeField = (TextField) courseBox.getChildren().get(1);
//
//            String courseName = courseNameField.getText();
//            try {
//                double grade = Double.parseDouble(gradeField.getText());
//                courses.add(new Course(courseName, grade));
//            } catch (NumberFormatException e) {
//                showAlert("Invalid grade entered. Please enter numeric values.");
//                return;
//            }
//        }
//
//        double total = 0, highest = Double.MIN_VALUE, lowest = Double.MAX_VALUE;
//        for (Course c : courses) {
//            total += c.grade;
//            if (c.grade > highest) highest = c.grade;
//            if (c.grade < lowest) lowest = c.grade;
//        }
//        double average = courses.isEmpty() ? 0 : total / courses.size();
//
//        reportContent = "Student Report:\n";
//        reportContent += "Name: " + studentName + "\nClass: " + studentClass +
//                "\nRoll: " + studentRoll + "\nSection: " + studentSection + "\n\n";
//
//        for (Course c : courses) {
//            reportContent += c.name + ": " + c.grade + "\n";
//        }
//        reportContent += "\nAverage: " + average +
//                "\nHighest: " + highest +
//                "\nLowest: " + lowest;
//
//        // Show the report in a dialog
//        Alert reportDialog = new Alert(Alert.AlertType.INFORMATION);
//        reportDialog.setHeaderText("Generated Report");
//        reportDialog.setContentText(reportContent);
//        reportDialog.showAndWait();
//    }
//
//    // Generate PDF without showing "success" message
//    private void generatePDF() {
//        try {
//            Document document = new Document();
//            String studentName = studentNameField.getText();
//            PdfWriter.getInstance(document, new FileOutputStream(studentName + "_Report.pdf"));
//            document.open();
//            document.add(new Paragraph(reportContent));
//            document.close();
//        } catch (Exception e) {
//            showAlert("Error generating PDF: " + e.getMessage());
//        }
//    }
//
//    // Alert Box
//    private void showAlert(String message) {
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setContentText(message);
//        alert.showAndWait();
//    }
//
//    // Course Class
//    static class Course {
//        String name;
//        double grade;
//
//        public Course(String name, double grade) {
//            this.name = name;
//            this.grade = grade;
//        }
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentGradeApp extends Application {

    private TextField studentNameField, studentClassField, studentRollField, studentSectionField;
    private VBox coursesContainer;
    private List<Course> courses = new ArrayList<>();
    private String reportContent = ""; // Store generated report content

    @Override
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("Student Grade Management App");
//
//        // Centered Layout for Input
//        GridPane studentInfoGrid = new GridPane();
//        studentInfoGrid.setPadding(new Insets(10));
//        studentInfoGrid.setHgap(10);
//        studentInfoGrid.setVgap(10);
//        studentInfoGrid.setStyle("-fx-alignment: center;");
//
//        studentInfoGrid.add(new Label("Student Name:"), 0, 0);
//        studentNameField = new TextField();
//        studentInfoGrid.add(studentNameField, 1, 0);
//
//        studentInfoGrid.add(new Label("Class:"), 0, 1);
//        studentClassField = new TextField();
//        studentInfoGrid.add(studentClassField, 1, 1);
//
//        studentInfoGrid.add(new Label("Roll:"), 0, 2);
//        studentRollField = new TextField();
//        studentInfoGrid.add(studentRollField, 1, 2);
//
//        studentInfoGrid.add(new Label("Section:"), 0, 3);
//        studentSectionField = new TextField();
//        studentInfoGrid.add(studentSectionField, 1, 3);
//
//        // Course Input Section
//        Button addCourseButton = new Button("Add Course");
//        coursesContainer = new VBox(10);
//        coursesContainer.setPadding(new Insets(10));
//        coursesContainer.setAlignment(Pos.CENTER);
//
//        addCourseButton.setOnAction(e -> addCourseField());
//        coursesContainer.getChildren().add(addCourseButton);
//
//        // Report and Download Section
//        Button generateReportButton = new Button("Generate Report");
//        generateReportButton.setOnAction(e -> generateReport());
//
//        Button downloadReportButton = new Button("Download Report");
//        downloadReportButton.setOnAction(e -> downloadPDF(primaryStage));
//
//        HBox buttonBox = new HBox(15, generateReportButton, downloadReportButton);
//        buttonBox.setAlignment(Pos.CENTER);
//
//        // Main Layout
//        VBox mainLayout = new VBox(15);
//        mainLayout.setPadding(new Insets(20));
//        mainLayout.getChildren().addAll(new Label("Student Information"), studentInfoGrid,
//                new Label("Courses and Grades"), coursesContainer,
//                generateReportButton, downloadReportButton);
//        mainLayout.setStyle("-fx-alignment: center;");
//
//        Scene scene = new Scene(mainLayout, 600, 600);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student Grade Management App");

        // Student Info Section
        GridPane studentInfoGrid = new GridPane();
        studentInfoGrid.setAlignment(Pos.CENTER); // Center align the grid
        studentInfoGrid.setPadding(new Insets(10));
        studentInfoGrid.setHgap(10);
        studentInfoGrid.setVgap(10);

        studentInfoGrid.add(new Label("Student Name:"), 0, 0);
        studentNameField = new TextField();
        studentInfoGrid.add(studentNameField, 1, 0);

        studentInfoGrid.add(new Label("Class:"), 0, 1);
        studentClassField = new TextField();
        studentInfoGrid.add(studentClassField, 1, 1);

        studentInfoGrid.add(new Label("Roll:"), 0, 2);
        studentRollField = new TextField();
        studentInfoGrid.add(studentRollField, 1, 2);

        studentInfoGrid.add(new Label("Section:"), 0, 3);
        studentSectionField = new TextField();
        studentInfoGrid.add(studentSectionField, 1, 3);

        // Course Section
        Button addCourseButton = new Button("Add Course");
        coursesContainer = new VBox(10);
        coursesContainer.setAlignment(Pos.CENTER); // Center align the VBox
        coursesContainer.setPadding(new Insets(10));
        addCourseButton.setOnAction(e -> addCourseField());
        coursesContainer.getChildren().add(addCourseButton);

        // Generate Report and Download Report Buttons
        Button generateReportButton = new Button("Generate Report");
        generateReportButton.setOnAction(e -> generateReport());

        Button downloadReportButton = new Button("Download Report");
        downloadReportButton.setOnAction(e -> downloadPDF(primaryStage));

        HBox buttonBox = new HBox(15, generateReportButton, downloadReportButton);
        buttonBox.setAlignment(Pos.CENTER);

        // Main Layout
        VBox mainLayout = new VBox(20);
        mainLayout.setPadding(new Insets(20));
        mainLayout.setAlignment(Pos.CENTER); // Center everything
        mainLayout.getChildren().addAll(
                new Label("Student Information"),
                studentInfoGrid,
                new Label("Courses and Grades"),
                coursesContainer,
                buttonBox
        );

        Scene scene = new Scene(mainLayout, 600, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Add Course Fields
    private void addCourseField() {
        HBox courseBox = new HBox(10);
        courseBox.setAlignment(Pos.CENTER);
        TextField courseNameField = new TextField();
        courseNameField.setPromptText("Course Name");

        TextField gradeField = new TextField();
        gradeField.setPromptText("Grade");

        Button removeButton = new Button("Remove");
        removeButton.setOnAction(e -> coursesContainer.getChildren().remove(courseBox));

        courseBox.getChildren().addAll(courseNameField, gradeField, removeButton);
        coursesContainer.getChildren().add(courseBox);
    }

    // Generate Report and Display It
    private void generateReport() {
        // Collect data
        String studentName = studentNameField.getText();
        String studentClass = studentClassField.getText();
        String studentRoll = studentRollField.getText();
        String studentSection = studentSectionField.getText();

        courses.clear();
        for (int i = 1; i < coursesContainer.getChildren().size(); i++) {
            HBox courseBox = (HBox) coursesContainer.getChildren().get(i);
            TextField courseNameField = (TextField) courseBox.getChildren().get(0);
            TextField gradeField = (TextField) courseBox.getChildren().get(1);

            String courseName = courseNameField.getText();
            try {
                double grade = Double.parseDouble(gradeField.getText());
                courses.add(new Course(courseName, grade));
            } catch (NumberFormatException e) {
                showAlert("Invalid grade entered. Please enter numeric values.");
                return;
            }
        }

        // Calculate report data
        double total = 0, highest = Double.MIN_VALUE, lowest = Double.MAX_VALUE;
        StringBuilder report = new StringBuilder();
        report.append("Student Report:\n");
        report.append("Name: ").append(studentName).append("\nClass: ").append(studentClass)
                .append("\nRoll: ").append(studentRoll).append("\nSection: ").append(studentSection).append("\n\n");

        for (Course c : courses) {
            total += c.grade;
            if (c.grade > highest) highest = c.grade;
            if (c.grade < lowest) lowest = c.grade;
            report.append(c.name).append(": ").append(c.grade).append("\n");
        }
        double average = courses.isEmpty() ? 0 : total / courses.size();

        report.append("\nAverage: ").append(average)
                .append("\nHighest: ").append(highest)
                .append("\nLowest: ").append(lowest);

        reportContent = report.toString(); // Store for PDF generation

        // Show the report content
        showAlert(reportContent);
    }

    // Generate PDF and Save It
//    private void downloadPDF(Stage stage) {
//        if (reportContent.isEmpty()) {
//            showAlert("Please generate the report first.");
//            return;
//        }
//
//        FileChooser fileChooser = new FileChooser();
//        fileChooser.setTitle("Save PDF");
//        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF Files", "*.pdf"));
//        File file = fileChooser.showSaveDialog(stage);
//
//        if (file != null) {
//            try {
//                Document document = new Document();
//                PdfWriter.getInstance(document, new FileOutputStream(file));
//                document.open();
//
//                document.add(new Paragraph("Student Report"));
//                document.add(new Paragraph("\n"));
//                document.add(new Paragraph())
//
//                // Add Table for Courses and Grades
//                PdfPTable table = new PdfPTable(2);
//                table.addCell("Course Name");
//                table.addCell("Grade");
//
//                for (Course c : courses) {
//                    table.addCell(c.name);
//                    table.addCell(String.valueOf(c.grade));
//                }
//                document.add(table);
//                document.add(new Paragraph("\nAverage: " + courses.stream().mapToDouble(c -> c.grade).average().orElse(0.0)));
//
//                document.close();
//                showAlert("PDF saved successfully!");
//            } catch (Exception e) {
//                showAlert("Error generating PDF: " + e.getMessage());
//            }
//        }
//    }

    private void downloadPDF(Stage stage) {
        if (reportContent.isEmpty()) {
            showAlert("Please generate the report first.");
            return;
        }

        // Collect student details
        String studentName = studentNameField.getText();
        String studentClass = studentClassField.getText();
        String studentRoll = studentRollField.getText();
        String studentSection = studentSectionField.getText();

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save PDF");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF Files", "*.pdf"));
        File file = fileChooser.showSaveDialog(stage);

        if (file != null) {
            try {
                Document document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(file));
                document.open();

                // Add Student Info
                document.add(new Paragraph("Student Report"));
                document.add(new Paragraph("\n"));
                document.add(new Paragraph("Name: " + studentName));
                document.add(new Paragraph("Class: " + studentClass));
                document.add(new Paragraph("Roll: " + studentRoll));
                document.add(new Paragraph("Section: " + studentSection));
                document.add(new Paragraph("\n"));

                // Add Table for Courses and Grades
                PdfPTable table = new PdfPTable(2);
                table.addCell("Course Name");
                table.addCell("Grade");

                double total = 0, highest = Double.MIN_VALUE, lowest = Double.MAX_VALUE;

                for (Course c : courses) {
                    table.addCell(c.name);
                    table.addCell(String.valueOf(c.grade));
                    total += c.grade;
                    if (c.grade > highest) highest = c.grade;
                    if (c.grade < lowest) lowest = c.grade;
                }
                document.add(table);

                // Calculate average
                double average = courses.isEmpty() ? 0 : total / courses.size();

                // Add average, highest, and lowest marks
                document.add(new Paragraph("\nAverage: " + average));
                document.add(new Paragraph("Highest: " + (highest == Double.MIN_VALUE ? "N/A" : highest)));
                document.add(new Paragraph("Lowest: " + (lowest == Double.MAX_VALUE ? "N/A" : lowest)));

                document.close();
                showAlert("PDF saved successfully!");
            } catch (Exception e) {
                showAlert("Error generating PDF: " + e.getMessage());
            }
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(message);
        alert.showAndWait();
    }

    static class Course {
        String name;
        double grade;

        public Course(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
