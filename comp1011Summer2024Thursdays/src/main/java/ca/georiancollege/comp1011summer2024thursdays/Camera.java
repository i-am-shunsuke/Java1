package ca.georiancollege.comp1011summer2024thursdays;

public class Camera {
//    default void powerState(){
//
//    }
    private String lens="", sensor="", color="", make="", model="";

    private int numOfPhotosTaken, yearReleased=2024;
    private float videoHoursRecorded;


    private void validate(String title, String data){
        if(data.trim().isEmpty()){
            throw new IllegalArgumentException(title+ " is too short. " +
                    "Needs to be at least 1 character");

        }
    }
    public String getLens() {
        return lens;
    }

    public void setLens(String lens) {
        validate("Lens", lens);
        this.lens = lens;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        validate("Sensor", sensor);
        this.sensor = sensor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        validate("Color", color);
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        validate("Make" ,make);
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Camera(String model, String make, String color, String sensor, String lens) {
//        this.model = model;
//        this.make = make;
//        this.color = color;
//        this.sensor = sensor;
//        this.lens = lens;

        setModel(model);
        setMake(make);
        setColor(color);
        setSensor(sensor);
        setLens(lens);
    }
    public Camera(){}

    public boolean takePicture(int howmany){
        numOfPhotosTaken++;
        return true;
    }

    public boolean recordVideo(float howLong){
        videoHoursRecorded +=howLong;
        return true;
    }
    public boolean isOldCamera(){
        int currentYear=2024;
        return currentYear - yearReleased >=3;
    }
    public boolean diplayVideo(String...filters){
        for(String filter : filters){
            System.out.println("Applying filter: "+filter);
        }
        return true;
    }




//    public String color;
//    private String make, model;
//    public enum PowerStates{ON, OFF}
//    public enum ShutterTypes{OPEN, CLOSED}
//    private PowerStates powerState = PowerStates.OFF;
//    private ShutterTypes shutter = ShutterTypes.CLOSED;
//    private int numberOfPhotos;
//    private double hoursOfVideoRecordings;
//
//
//    public boolean takePhoto(String mode, int howMany){
//        numberOfPhotos++;
//        System.out.println("Take photo in mode " + mode);
//        return true;
//    }
//
//    public boolean savePhoto(int photoId){
//        System.out.println("Saving photo with ID= " +photoId);
//        return true;
//    }
//
//    public boolean recordVideo(double howLong){
//        hoursOfVideoRecordings+=howLong;
//        return true;
//    }
//
//    public Camera(){}

    //alt + insert
//    private void validate(String title, String content){
//
//    }
//    public void setColor(String color){
//        validate("name", make);
//        this.color=color;
//    }

}
