import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Hospital{

    String Hospital_name ;
    String Hospital_address ;
    private double Hospital_money ;

    private double Hospital_Insurance_Amount;

    private String Hospital_staff ;

    Hospital(){

    }
    //    to get hospital money
    public double getHospital_money() {
        return Hospital_money;
    }
//    to set hospital money

    public void setHospital_money(double hospital_money) {
        Hospital_money = hospital_money;
    }

    //    to get hospital staff info
    public String getHospital_staff() {
        return Hospital_staff;
    }

    //    to get hospital insurance amount
    public double getHospital_Insurance_Amount() {

        return Hospital_Insurance_Amount;
    }

//    to set hospital insurance amount

    public void setHospital_Insurance_Amount(double hospital_Insurance_Amount) {
        Hospital_Insurance_Amount = hospital_Insurance_Amount;
    }
    //    to set hospital staff info
    public void setHospital_staff(String hospital_staff) {

        Hospital_staff = hospital_staff;

    }

//    Hospital constructor
    Hospital(String Hospital_name,String Hospital_address,double Hospital_money,double Hospital_Insurance_Amount){
        this.Hospital_name = Hospital_name;
        this.Hospital_address = Hospital_address;
        this.Hospital_money = Hospital_money;
        this.Hospital_Insurance_Amount = Hospital_Insurance_Amount;
    }

//    To print Hospital info

    public void Hospital_info(){
        System.out.println("Hospital_name : "+Hospital_name);
        System.out.println("Hospital_address : "+Hospital_address);
        System.out.println("Hospital_staff : "+Hospital_staff);
        System.out.println("Hospital_money : "+ getHospital_money());
        System.out.println("Hospital_Insurance_Amount : "+getHospital_Insurance_Amount());
    }
}

//============================================================================================================================================

class Departments extends Hospital{

    String Dept_Name ;
    String Dept_Degree;
    double Dept_Exp;
    String Dept_Specialization;



    //    for child class
    Departments(){

    }



    Departments(String Dept_Name,String Dept_Degree,double Dept_Exp,String Dept_Specialization){

        this.Dept_Name = Dept_Name;
        this.Dept_Degree = Dept_Degree;
        this.Dept_Exp = Dept_Exp;
        this.Dept_Specialization = Dept_Specialization;
        this.setHospital_staff(Dept_Name);
    }
    public String getDept_name(){
        return Dept_Name;
    }

    public void Deptinfo(){
        System.out.println("Dept_Name : "+Dept_Name);
        System.out.println("Dept_Degree : "+Dept_Degree);
        System.out.println("Dept_Exp : "+Dept_Exp);
        System.out.println("Dept_Specialization : "+Dept_Specialization);
    }

}

//==========================================================================================================================

class Accounts extends Departments{

    String Patient_name;
    double Account_money;

    // for adding all accounts money into hospitals money
    public void money(){
        double updated_Hospital_acoount_money =getHospital_money() + Account_money;
        this.setHospital_money(updated_Hospital_acoount_money);
    }

//    default constructor

    Accounts(){

    }
    // constructor for accounts
    Accounts(String Patient_name ,double Account_money,String Dept_Name,String Dept_Degree,double Dept_Exp,String Dept_Specialization){
        this.Dept_Degree = Dept_Degree;
        this.Dept_Exp = Dept_Exp;
        this.Dept_Specialization = Dept_Specialization;
        this.Dept_Name =Dept_Name;
        this.Patient_name=Patient_name;
        this.Account_money=Account_money;
        this.setHospital_money(Account_money);
        this.money();
    }

    public void AccountInfo(){
        System.out.println("Patient_name : "+Patient_name);
        System.out.println("Account_money : "+Account_money);
        System.out.println("Dept_Name : "+Dept_Name);
        System.out.println("Dept_Degree :"+Dept_Degree);
        System.out.println("Dept_Exp : "+Dept_Exp);
        System.out.println("Dept_Specialization : "+Dept_Specialization);
    }

}

//===========================================================================================================================
class Admission extends Accounts{

}
//============================================================================================================================
class Admit extends Admission{
    private String Patient_First_name;
    private String Patient_Middle_name;
    private String Patient_Last_name;
    private int Patient_Age;
    private String Patient_Sex;
    private String Patient_Address;
    private String Patient_MbNo;
    private String Patient_Realtion;

    public String getPatient_First_name() {
        return Patient_First_name;
    }

    public void setPatient_First_name(String patient_First_name) {
        Patient_First_name = patient_First_name;
    }

    public String getPatient_Middle_name() {
        return Patient_Middle_name;
    }

    public void setPatient_Middle_name(String patient_Middle_name) {
        Patient_Middle_name = patient_Middle_name;
    }

    public String getPatient_Last_name() {
        return Patient_Last_name;
    }

    public void setPatient_Last_name(String patient_Last_name) {
        Patient_Last_name = patient_Last_name;
    }

    public int getPatient_Age() {
        return Patient_Age;
    }

    public void setPatient_Age(int patient_Age) {
        Patient_Age = patient_Age;
    }

    public String getPatient_Sex() {
        return Patient_Sex;
    }

    public void setPatient_Sex(String patient_Sex) {
        Patient_Sex = patient_Sex;
    }

    public String getPatient_MbNo() {
        return Patient_MbNo;
    }

    public void setPatient_MbNo(String patient_MbNo) {
        Patient_MbNo = patient_MbNo;
    }

    public String getPatient_Address() {
        return Patient_Address;
    }

    public void setPatient_Address(String patient_Address) {
        Patient_Address = patient_Address;
    }

    public String getPatient_Realtion() {
        return Patient_Realtion;
    }

    public void setPatient_Realtion(String patient_Realtion) {
        Patient_Realtion = patient_Realtion;
    }

//    default constructor

    Admit(){

    }
//    To take Admit info from user

    public void Admit_add(String Patient_First_name, String Patient_Middle_name, String Patient_Last_name, int Patient_Age, String Patient_Sex, String Patient_Address, String Patient_MbNo, String Patient_Realtion){
        this.setPatient_First_name(Patient_First_name);
        this.setPatient_Middle_name(Patient_Middle_name);
        this.setPatient_Last_name(Patient_Last_name);
        this.setPatient_Age(Patient_Age);
        this.setPatient_Sex(Patient_Sex);
        this.setPatient_Address(Patient_Address);
        this.setPatient_MbNo(Patient_MbNo);
        this.setPatient_Realtion(Patient_Realtion);
    }



    //    To take admit info
    Admit(String Patient_First_name,String Patient_Middle_name,String Patient_Last_name,int Patient_Age,String Patient_Sex,String Patient_Address,String Patient_MbNo,String Patient_Realtion){
        this.setPatient_First_name(Patient_First_name);
        this.setPatient_Middle_name(Patient_Middle_name);
        this.setPatient_Last_name(Patient_Last_name);
        this.setPatient_Age(Patient_Age);
        this.setPatient_Sex(Patient_Sex);
        this.setPatient_Address(Patient_Address);
        this.setPatient_MbNo(Patient_MbNo);
        this.setPatient_Realtion(Patient_Realtion);
    }


// To get specific data

//    Admission Ad = new Admission();
//    Admit(String patient_First_name, String patient_Middle_name, String patient_Last_name, int patient_Age, String patient_Sex, String patient_Address, String patient_MbNo, String patient_Realtion){
//        this.patient_First_name = Ad.getPatient_First_name();
//        this.patient_Middle_name = Ad.getPatient_Middle_name();
//        this.patient_Last_name = Ad.getPatient_Last_name();
//        this.patient_Age = Ad.getPatient_Age();
//        this.patient_Sex = Ad.getPatient_Sex();
//        this.patient_Address = Ad.getPatient_Address();
//        this.patient_MbNo = Ad.getpatient_MbNo();
//        this.patient_Realtion = Ad.getpatient_Realtion();
//
//    }



//    ----------------------------To print admit info------------------------------------------------------------------------------

    public void AdmitInfo(){
        System.out.println("Patient_First_name : "+getPatient_First_name());
        System.out.println("Patient_Middle_name : "+getPatient_Middle_name());
        System.out.println("Patient_Last_name : "+getPatient_Last_name());
        System.out.println("Patient_Age : "+getPatient_Age());
        System.out.println("Patient_Sex : "+getPatient_Sex());
        System.out.println("Patient_Address : "+getPatient_Address());
        System.out.println("Patient_MbNo : "+getPatient_MbNo());
        System.out.println("Patient_Realtion : "+getPatient_Realtion());
    }
}
//===========================================================================================================================
class Discharge {
    private String Discharge_Patient_First_name;
    private String Discharge_Patient_Middle_name;
    private String Discharge_Patient_Last_name;
    private int Discharge_Patient_Age;
    private String Discharge_Patient_Sex;
    private String Discharge_Patient_Address;
    private String Discharge_Patient_MbNo;
    private String Discharge_Patient_Realtion;

    public String Discharge_getPatient_First_name() {
        return Discharge_Patient_First_name;
    }

    public void setDischarge_Patient_First_name(String Discharge_patient_First_name) {
        Discharge_Patient_First_name = Discharge_patient_First_name;
    }

    public String Discharge_getPatient_Middle_name() {
        return Discharge_Patient_Middle_name;
    }

    public void setDischarge_Patient_Middle_name(String Discharge_patient_Middle_name) {
        Discharge_Patient_Middle_name = Discharge_patient_Middle_name;
    }

    public String Discharge_getPatient_Last_name() {
        return Discharge_Patient_Last_name;
    }

    public void setDischarge_Patient_Last_name(String Discharge_patient_Last_name) {
        Discharge_Patient_Last_name = Discharge_patient_Last_name;
    }

    public int Discharge_getPatient_Age() {
        return Discharge_Patient_Age;
    }

    public void setDischarge_Patient_Age(int Discharge_patient_Age) {
        Discharge_Patient_Age = Discharge_patient_Age;
    }

    public String Discharge_getPatient_Sex() {
        return Discharge_Patient_Sex;
    }

    public void setDischarge_Patient_Sex(String Discharge_patient_Sex) {
        Discharge_Patient_Sex = Discharge_patient_Sex;
    }

    public String Discharge_getPatient_MbNo() {
        return Discharge_Patient_MbNo;
    }

    public void setDischarge_Patient_MbNo(String Discharge_patient_MbNo) {
        Discharge_Patient_MbNo = Discharge_patient_MbNo;
    }

    public String Discharge_getPatient_Address() {
        return Discharge_Patient_Address;
    }

    public void setDischarge_Patient_Address(String Discharge_patient_Address) {
        Discharge_Patient_Address = Discharge_patient_Address;
    }

    public String Discharge_getPatient_Realtion() {
        return Discharge_Patient_Realtion;
    }

    public void setDischarge_Patient_Realtion(String Discharge_patient_Realtion) {
        Discharge_Patient_Realtion = Discharge_patient_Realtion;
    }

    public void Discharge_add(String Discharge_Patient_First_name, String Discharge_Patient_Middle_name, String Discharge_Patient_Last_name, int Discharge_Patient_Age, String Discharge_Patient_Sex, String Discharge_Patient_Address, String Discharge_Patient_MbNo, String Discharge_Patient_Realtion){
        this.setDischarge_Patient_First_name(Discharge_Patient_First_name);
        this.setDischarge_Patient_Middle_name(Discharge_Patient_Middle_name);
        this.setDischarge_Patient_Last_name(Discharge_Patient_Last_name);
        this.setDischarge_Patient_Age(Discharge_Patient_Age);
        this.setDischarge_Patient_Sex(Discharge_Patient_Sex);
        this.setDischarge_Patient_Address(Discharge_Patient_Address);
        this.setDischarge_Patient_MbNo(Discharge_Patient_MbNo);
        this.setDischarge_Patient_Realtion(Discharge_Patient_Realtion);

    }

    Discharge(){

    }
    Discharge(String Discharge_Patient_First_name, String Discharge_Patient_Middle_name, String Discharge_Patient_Last_name, int Discharge_Patient_Age, String Discharge_Patient_Sex, String Discharge_Patient_Address, String Discharge_Patient_MbNo, String Discharge_Patient_Realtion){
        this.Discharge_Patient_First_name = Discharge_Patient_First_name;
        this.Discharge_Patient_Middle_name = Discharge_Patient_Middle_name;
        this.Discharge_Patient_Last_name = Discharge_Patient_Last_name;
        this.Discharge_Patient_Age = Discharge_Patient_Age;
        this.Discharge_Patient_Sex = Discharge_Patient_Sex;
        this.Discharge_Patient_Address = Discharge_Patient_Address;
        this.Discharge_Patient_MbNo = Discharge_Patient_MbNo;
        this.Discharge_Patient_Realtion = Discharge_Patient_Realtion;
    }

    public void Discharge_Info() {
        System.out.println("Discharge_Patient_First_name : " + Discharge_Patient_First_name);
        System.out.println("Discharge_Patient_Middle_name : " + Discharge_Patient_Middle_name);
        System.out.println("Discharge_Patient_Last_name : " + Discharge_Patient_Last_name);
        System.out.println("Discharge_Patient_Age : " + Discharge_Patient_Age);
        System.out.println("Discharge_Patient_Sex : " + Discharge_Patient_Sex);
        System.out.println("Discharge_Patient_Address : " + Discharge_Patient_Address);
        System.out.println("Discharge_Patient_MbNo : " + Discharge_Patient_MbNo);
        System.out.println("Discharge_Patient_Realtion : " + Discharge_Patient_Realtion);
    }

}
//===========================================================================================================================

//============================================================================================================================
class Insurance extends Departments {
    String Patient_name;
    String Patient_gender;
    int Patient_age;
    String Patient_disease;
    private double Patient_claimAmount;

    //    to get Patient_claimAmount
    public double getPatient_claimAmount() {

        return Patient_claimAmount;
    }


    //    //    to set Patient_claimAmount
    public void setPatient_claimAmount(double patient_claimAmount) {

        Patient_claimAmount = patient_claimAmount;
    }


    public void moneyDeduct() {
        // Assuming hospitalInsuranceAmount is always greater than patientClaimAmount
        double deductAmt = getHospital_Insurance_Amount() - getPatient_claimAmount();
        setHospital_Insurance_Amount(deductAmt);
    }

    Insurance(String Patient_name,String Patient_gender,int Patient_age,String Patient_disease,double Patient_claimAmount){
        this.Patient_name = Patient_name;
        this.Patient_gender = Patient_gender;
        this.Patient_age = Patient_age;
        this.Patient_disease = Patient_disease;
        this.Patient_claimAmount = Patient_claimAmount;
//        this.moneyDeduct();
    }

    public void Insurance_Info(){
        System.out.println("Patient_name : "+Patient_name);
        System.out.println("Patient_gender : "+Patient_gender);
        System.out.println("Patient_age : "+Patient_age);
        System.out.println("Patient_disease : "+Patient_disease);
        System.out.println("Patient_claimAmount : "+Patient_claimAmount);
    }

}

//=====================================================================================================

class Management_staff extends Departments{
    //    Departments D = new Departments();
    String Staff_Name;
    String Staff_Dept_name = getDept_name();

//    Departments d = Hospital D();
    public String getStaff_Dept_name() {
        return this.getDept_name();
    }

    private double Staff_sal ;

    public double getStaff_sal() {

        return Staff_sal;
    }

    public void setStaff_sal(double staff_sal) {
        Staff_sal = staff_sal;
    }

    int Staff_age;
    String Staff_gender;
    String Staff_Specialization = Dept_Specialization;

    Management_staff(){

    }
    public void Staff_info(){
        System.out.println("Staff_Name : "+Staff_Name);
        System.out.println("Staff_Dept_name : "+getStaff_Dept_name());
        System.out.println("Staff_sal : "+getStaff_sal());
        System.out.println("Staff_age : "+Staff_age);
        System.out.println("Staff_gender : "+Staff_gender);
        System.out.println("Staff_spealization : "+Staff_Specialization);
    }

    Management_staff(String Staff_Name,double Staff_sal ,int Staff_age,String Staff_gender) {
        this.Staff_Name = Staff_Name;
        this.Staff_sal = Staff_sal;
        this.Staff_age = Staff_age;
        this.Staff_gender = Staff_gender;
        this.Staff_Dept_name = this.getDept_name();
    }

    public void Management_staff_Info(){
        System.out.println("Staff_Name : "+Staff_Name);
        System.out.println("Staff_sal : "+Staff_sal);
        System.out.println("Staff_age : "+Staff_age);
        System.out.println("Staff_gender : "+Staff_gender);
    }
}
//=========================================================================
class Manage_Accouts extends Management_staff{
    private  String Payment_Name;
    private  String Payment_Type;
    private  double Payment_Amount;
    private  String Payment_Dept_name;
    private  String Payee;

    public String getPayment_Name() {
        return Payment_Name;
    }

    public void setPayment_Name(String payment_Name) {
        Payment_Name = payment_Name;
    }

    public String getPayment_Type() {
        return Payment_Type;
    }

    public void setPayment_Type(String payment_Type) {
        Payment_Type = payment_Type;
    }

    public double getPayment_Amount() {
        return Payment_Amount;
    }

    public void setPayment_Amount(double payment_Amount) {
        Payment_Amount = payment_Amount;
    }

    public String getPayment_Dept_name() {
        return Payment_Dept_name;
    }

    public void setPayment_Dept_name(String payment_Dept_name) {
        Payment_Dept_name = payment_Dept_name;
    }

    public String getPayee(){
        return Payee;
    }
    public void setPayee(String payee){
        Payee = Payee;
    }

    Manage_Accouts(String Payment_Name,String Payment_Type,double Payment_Amount,String Payment_Dept_name,String Payee){
        this.Payment_Name = Payment_Name;
        this.Payment_Type = Payment_Type;
        this.Payment_Amount = Payment_Amount;
        this.Payment_Dept_name = Payment_Dept_name;
        this.Payee = Payee;
    }

    public void Manage_Accouts_Info(){
        System.out.println("Payment_Name : "+Payment_Name);
        System.out.println("Payment_Type  : "+Payment_Type);
        System.out.println("Payment_Amount : "+Payment_Amount);
        System.out.println("Payment_Dept_name : "+Payment_Dept_name);
    }
}

//==============================================================================================================================================

class Pharmacy extends Hospital{
    String Pharmacy_Name;
    String Pharmacy_Address;
    private double Pharmacy_Money;

    public double getPharmacy_Money() {
        return Pharmacy_Money;
    }

    public void setPharmacy_Money(double pharmacy_Money) {
        Pharmacy_Money = pharmacy_Money;
    }

    Pharmacy(){

    }
    Pharmacy(String Pharmacy_Name,String Pharmacy_Address,double Pharmacy_Money){
        this.Pharmacy_Name = Pharmacy_Name;
        this.Pharmacy_Address = Pharmacy_Address;
        this.Pharmacy_Money = Pharmacy_Money;
    }

    public void Pharmacy_info(){
        System.out.println("Pharmacy_Name : "+Pharmacy_Name);
        System.out.println("Pharmacy_Address : "+Pharmacy_Address);
        System.out.println("Pharmacy_Money : "+Pharmacy_Money);
    }
}
// ===================================================================================================================================
class Pharmacy_Staff extends Pharmacy{
    private String Pharmacy_Staff_name;
    private double Pharmacy_Staff_sal;
    private String Pharmacy_Staff_Designation;
    private double Pharmacy_Staff_Experiance;

    public String getPharmacy_Staff_name() {
        return Pharmacy_Staff_name;
    }

    public void setPharmacy_Staff_name(String pharmacy_Staff_name) {
        Pharmacy_Staff_name = pharmacy_Staff_name;
    }

    public double getPharmacy_Staff_sal() {
        return Pharmacy_Staff_sal;
    }

    public void setPharmacy_Staff_sal(double pharmacy_Staff_sal) {
        Pharmacy_Staff_sal = pharmacy_Staff_sal;
    }

    public String getPharmacy_Staff_Designation() {
        return Pharmacy_Staff_Designation;
    }

    public void setPharmacy_Staff_Designation(String pharmacy_Staff_Designation) {
        Pharmacy_Staff_Designation = pharmacy_Staff_Designation;
    }

    public double getPharmacy_Staff_Experiance() {
        return Pharmacy_Staff_Experiance;
    }

    public void setPharmacy_Staff_Experiance(double pharmacy_Staff_Experiance) {
        Pharmacy_Staff_Experiance = pharmacy_Staff_Experiance;
    }
//    -------------------------------- to add data automatically (by user)-------------------------------------------------------

    public void Pharmacy_Staff_add(String Pharmacy_Staff_name,double Pharmacy_Staff_sal,String Pharmacy_Staff_Designation,double Pharmacy_Staff_Experiance){
        this.setPharmacy_Staff_name(Pharmacy_Staff_name);
        this.setPharmacy_Staff_sal(Pharmacy_Staff_sal);
        this.setPharmacy_Staff_Designation(Pharmacy_Staff_Designation);
        this.setPharmacy_Staff_Experiance(Pharmacy_Staff_Experiance);
    }
//    ----------------------Constructor for adding data manually --------------------------
    Pharmacy_Staff(String Pharmacy_Staff_name,double Pharmacy_Staff_sal,String Pharmacy_Staff_Designation,double Pharmacy_Staff_Experiance){
        this.Pharmacy_Staff_name = Pharmacy_Staff_name;
        this.Pharmacy_Staff_sal = Pharmacy_Staff_sal;
        this.Pharmacy_Staff_Designation = Pharmacy_Staff_Designation;
        this.Pharmacy_Staff_Experiance = Pharmacy_Staff_Experiance;
    }

//    To Print Pharmacy_Staff Info
    public  void  Pharmacy_Staff_Info(){
        System.out.println("Pharmacy_Staff_name : "+Pharmacy_Staff_name);
        System.out.println("Pharmacy_Staff_sal : "+Pharmacy_Staff_sal);
        System.out.println("Pharmacy_Staff_Designation : "+Pharmacy_Staff_Designation);
        System.out.println("Pharmacy_Staff_Experiance : "+Pharmacy_Staff_Experiance);
    }

}
class Pharmacy_Medicine extends  Pharmacy{
    private String Pharmacy_Medicine_Dealer_name;
    private double Pharmacy_Medicine_Price;
    private String Pharmacy_Medicine_Dealer_Loc;
    private double Pharmacy_Medicine_Dealer_Experiance;

    public String getPharmacy_Medicine_Dealer_name() {
        return Pharmacy_Medicine_Dealer_name;
    }

    public void setPharmacy_Medicine_Dealer_name(String pharmacy_Medicine_Dealer_name) {
        Pharmacy_Medicine_Dealer_name = pharmacy_Medicine_Dealer_name;
    }

    public double getPharmacy_Medicine_Price() {
        return Pharmacy_Medicine_Price;
    }

    public void setPharmacy_Medicine_Price(double pharmacy_Medicine_Price) {
        Pharmacy_Medicine_Price = pharmacy_Medicine_Price;
    }

    public String getPharmacy_Medicine_Dealer_Loc() {
        return Pharmacy_Medicine_Dealer_Loc;
    }

    public void setPharmacy_Medicine_Dealer_Loc(String pharmacy_Medicine_Dealer_Loc) {
        Pharmacy_Medicine_Dealer_Loc = pharmacy_Medicine_Dealer_Loc;
    }

    public double getPharmacy_Medicine_Dealer_Experiance() {
        return Pharmacy_Medicine_Dealer_Experiance;
    }

    public void setPharmacy_Medicine_Dealer_Experiance(double pharmacy_Medicine_Dealer_Experiance) {
        Pharmacy_Medicine_Dealer_Experiance = pharmacy_Medicine_Dealer_Experiance;
    }
//    ------------------------------- default constructor for sub class(inheritance)
    Pharmacy_Medicine(){

    }
//  --------------------------------------------To add / load data automatically -----------------------------------------------

    public void Pharmacy_Medicine_Dealer_add(String Pharmacy_Medicine_Dealer_name,double Pharmacy_Medicine_Price,String Pharmacy_Medicine_Dealer_Loc,double Pharmacy_Medicine_Dealer_Experianc){
        this.setPharmacy_Medicine_Dealer_name(Pharmacy_Medicine_Dealer_name);
        this.setPharmacy_Medicine_Price(Pharmacy_Medicine_Price);
        this.setPharmacy_Medicine_Dealer_Loc(Pharmacy_Medicine_Dealer_Loc);
        this.setPharmacy_Medicine_Dealer_Experiance(Pharmacy_Medicine_Dealer_Experianc);
    }

//    --------------------------------------- To add/load data manually --------------------------------------
     Pharmacy_Medicine(String Pharmacy_Medicine_Dealer_name,double Pharmacy_Medicine_Price,String Pharmacy_Medicine_Dealer_Loc,double Pharmacy_Medicine_Dealer_Experiance){
        this.Pharmacy_Medicine_Dealer_name = Pharmacy_Medicine_Dealer_name;
        this.Pharmacy_Medicine_Price = Pharmacy_Medicine_Price;
        this.Pharmacy_Medicine_Dealer_Loc = Pharmacy_Medicine_Dealer_Loc;
        this.Pharmacy_Medicine_Dealer_Experiance = Pharmacy_Medicine_Dealer_Experiance;
    }

//    ---------------------------------------- To print Medicine info --------------------------------------------------
    public void Pharmacy_Medicine_Info(){
        System.out.println("Pharmacy_Medicine_Dealer_name : "+Pharmacy_Medicine_Dealer_name);
        System.out.println("Pharmacy_Medicine_Price : "+Pharmacy_Medicine_Price);
        System.out.println("Pharmacy_Medicine_Dealer_Loc : "+Pharmacy_Medicine_Dealer_Loc);
        System.out.println("Pharmacy_Medicine_Dealer_Experiance : "+Pharmacy_Medicine_Dealer_Experiance);
    }

}
//========================================================================================================================================================================
class Medicene_Branded extends Pharmacy_Medicine{
    private String Medicene_Branded_Name;
    private String Medicene_Branded_Manufracture;
    private String Medicene_Branded_Use;
    private double Medicene_Branded_MfgNO;
    private String Medicene_Branded_MfgDate;
    private String Medicene_Branded_Mfg_Loc;
    private double Medicene_Branded_price;
    private final double Medicene_Branded_Power;

    public String getMedicene_Branded_Name() {
        return Medicene_Branded_Name;
    }

    public void setMedicene_Branded_Name(String medicene_Branded_Name) {
        Medicene_Branded_Name = medicene_Branded_Name;
    }

    public String getMedicene_Branded_Manufracture() {
        return Medicene_Branded_Manufracture;
    }

    public void setMedicene_Branded_Manufracture(String medicene_Branded_Manufracture) {
        Medicene_Branded_Manufracture = medicene_Branded_Manufracture;
    }

    public String getMedicene_Branded_Use() {
        return Medicene_Branded_Use;
    }

    public void setMedicene_Branded_Use(String medicene_Branded_Use) {
        Medicene_Branded_Use = medicene_Branded_Use;
    }

    public double getMedicene_Branded_MfgNO() {
        return Medicene_Branded_MfgNO;
    }

    public void setMedicene_Branded_MfgNO(double medicene_Branded_MfgNO) {
        Medicene_Branded_MfgNO = medicene_Branded_MfgNO;
    }

    public String  getMedicene_Branded_MfgDate() {
        return Medicene_Branded_MfgDate;
    }

    public void setMedicene_Branded_MfgDate(String medicene_Branded_MfgDate) {
        Medicene_Branded_MfgDate = medicene_Branded_MfgDate;
    }

    public String getMedicene_Branded_Mfg_Loc() {
        return Medicene_Branded_Mfg_Loc;
    }

    public void setMedicene_Branded_Mfg_Loc(String medicene_Branded_Mfg_Loc) {
        Medicene_Branded_Mfg_Loc = medicene_Branded_Mfg_Loc;
    }

    public double getMedicene_Branded_price() {
        return Medicene_Branded_price;
    }

    public void setMedicene_Branded_price(double medicene_Branded_price) {
        Medicene_Branded_price = medicene_Branded_price;
    }
    public double getMedicene_Branded_Power(){
        return Medicene_Branded_Power;
    }

    public  void setMedicene_Branded_Power(double Medicene_Branded_Power){
        Medicene_Branded_Power = Medicene_Branded_Power;
    }
//    ------------------------------------- method to load data automatically -----------------------------------------------------

    public void Pharmacy_Medicine_Branded(String Medicene_Branded_Name,String Medicene_Branded_Manufracture,String Medicene_Branded_Use,double Medicene_Branded_MfgNO,String Medicene_Branded_MfgDate,String Medicene_Branded_Mfg_Loc,double Medicene_Branded_price,final double Medicene_Branded_Power){
        this.setMedicene_Branded_Name(Medicene_Branded_Name);
        this.setMedicene_Branded_Manufracture(Medicene_Branded_Manufracture);
        this.setMedicene_Branded_Use(Medicene_Branded_Use);
        this.setMedicene_Branded_MfgNO(Medicene_Branded_MfgNO);
        this.setMedicene_Branded_MfgDate(Medicene_Branded_MfgDate);
        this.setMedicene_Branded_Mfg_Loc(Medicene_Branded_Mfg_Loc);
        this.setMedicene_Branded_price(Medicene_Branded_price);
        this.setMedicene_Branded_Power(Medicene_Branded_Power);

    }

//  --------------------------------------- constructor to load data Manually ------------------------------------------------
    Medicene_Branded(String Medicene_Branded_Name,String Medicene_Branded_Manufracture,String Medicene_Branded_Use,double Medicene_Branded_MfgNO,String Medicene_Branded_MfgDate,String Medicene_Branded_Mfg_Loc,double Medicene_Branded_price,double Medicene_Branded_Power){
        this.Medicene_Branded_Name = Medicene_Branded_Name;
        this.Medicene_Branded_Manufracture = Medicene_Branded_Manufracture;
        this.Medicene_Branded_Use = Medicene_Branded_Use;
        this.Medicene_Branded_MfgNO = Medicene_Branded_MfgNO;
        this.Medicene_Branded_MfgDate = Medicene_Branded_MfgDate;
        this.Medicene_Branded_Mfg_Loc = Medicene_Branded_Mfg_Loc;
        this.Medicene_Branded_price = Medicene_Branded_price;
        this.Medicene_Branded_Power = Medicene_Branded_Power;
    }

//    To print Medicene_Branded info

    public void Medicene_Branded_info(){
        System.out.println("Medicene_Branded_Name : "+Medicene_Branded_Name);
        System.out.println("Medicene_Branded_Manufracture : "+Medicene_Branded_Manufracture);
        System.out.println("Medicene_Branded_Use : "+Medicene_Branded_Use);
        System.out.println("Medicene_Branded_MfgNO : "+Medicene_Branded_MfgNO);
        System.out.println("Medicene_Branded_MfgDate : "+Medicene_Branded_MfgDate);
        System.out.println("Medicene_Branded_Mfg_Loc : "+Medicene_Branded_Mfg_Loc);
        System.out.println("Medicene_Branded_price : "+Medicene_Branded_price);
        System.out.println("Medicene_Branded_Power : "+Medicene_Branded_Power);
    }
}
//=================================================================================================================================================
class Medicine_Generic extends Pharmacy_Medicine{
    private final String Medicine_Generic_Name;
    private final String Medicine_Generic_Manufracture;
    private final String Medicine_Generic_Use;
    private final double Medicine_Generic_MfgNO;
    private final String Medicine_Generic_MfgDate;
    private final String Medicine_Generic_Mfg_Loc;
    private final double Medicine_Generic_price;
    private final double Medicine_Generic_Power;

    public String getMedicine_Generic_Name() {
        return Medicine_Generic_Name;
    }

    public void setMedicine_Generic_Name(String Medicine_Generic_Name) {
        Medicine_Generic_Name = Medicine_Generic_Name;
    }

    public String getMedicine_Generic_Manufracture() {
        return Medicine_Generic_Manufracture;
    }

    public void setMedicine_Generic_Manufracture(String Medicine_Generic_Manufracture) {
        Medicine_Generic_Manufracture = Medicine_Generic_Manufracture;
    }

    public String getMedicine_Generic_Use() {
        return Medicine_Generic_Use;
    }

    public void setMedicine_Generic_Use(String Medicine_Generic_Use) {
        Medicine_Generic_Use = Medicine_Generic_Use;
    }

    public double getMedicine_Generic_MfgNO() {
        return Medicine_Generic_MfgNO;
    }

    public void setMedicine_Generic_MfgNO(double Medicine_Generic_MfgNO) {
        Medicine_Generic_MfgNO = Medicine_Generic_MfgNO;
    }

    public String getMedicine_Generic_MfgDate() {

        return Medicine_Generic_MfgDate;
    }

    public void setMedicine_Generic_MfgDate(String Medicine_Generic_MfgDate) {
        Medicine_Generic_MfgDate = Medicine_Generic_MfgDate;
    }

    public String getMedicine_Generic_Mfg_Loc() {
        return Medicine_Generic_Mfg_Loc;
    }

    public void setMedicine_Generic_Mfg_Loc(String Medicine_Generic_Mfg_Loc) {
        Medicine_Generic_Mfg_Loc = Medicine_Generic_Mfg_Loc;
    }

    public double getMedicine_Generic_price() {
        return Medicine_Generic_price;
    }

    public void setMedicine_Generic_price(double Medicine_Generic_price) {
        Medicine_Generic_price = Medicine_Generic_price;
    }
    public double getMedicine_Generic_Power(){
        return Medicine_Generic_Power;
    }

    public  void setMMedicine_Generic_Power(double Medicine_Generic_Power){
        Medicine_Generic_Power = Medicine_Generic_Power;
    }
//    --------------------------------- to load data Automatically ----------------------------------------------

    public void Pharmacy_Madicine_Generic_Add(final String Medicine_Generic_Name,final String Medicine_Generic_Manufracture,final String Medicine_Generic_Use,final double Medicine_Generic_MfgNO,final String Medicine_Generic_MfgDate,final String Medicine_Generic_Mfg_Loc,final double Medicine_Generic_price,final double Medicine_Generic_Power){
        this.setMedicine_Generic_Name(Medicine_Generic_Name);
        this.setMedicine_Generic_Manufracture(Medicine_Generic_Manufracture);
        this.setMedicine_Generic_Use(Medicine_Generic_Use);
        this.setMedicine_Generic_MfgNO(Medicine_Generic_MfgNO);
        this.setMedicine_Generic_MfgDate(Medicine_Generic_MfgDate);
        this.setMedicine_Generic_Mfg_Loc(Medicine_Generic_Mfg_Loc);
        this.setMedicine_Generic_price(Medicine_Generic_price);
        this.setMMedicine_Generic_Power(Medicine_Generic_Power);

    }

//    -------------------------------- to load data manually ----------------------------------------------------
    Medicine_Generic(String Medicine_Generic_Name,String Medicine_Generic_Manufracture,String Medicine_Generic_Use,double Medicine_Generic_MfgNO,String Medicine_Generic_MfgDate,String Medicine_Generic_Mfg_Loc,double Medicine_Generic_price,double Medicine_Generic_Power){
        this.Medicine_Generic_Name = Medicine_Generic_Name;
        this.Medicine_Generic_Manufracture = Medicine_Generic_Manufracture;
        this.Medicine_Generic_Use = Medicine_Generic_Use;
        this.Medicine_Generic_MfgNO = Medicine_Generic_MfgNO;
        this.Medicine_Generic_MfgDate = Medicine_Generic_MfgDate;
        this.Medicine_Generic_Mfg_Loc = Medicine_Generic_Mfg_Loc;
        this.Medicine_Generic_price = Medicine_Generic_price;
        this.Medicine_Generic_Power = Medicine_Generic_Power;
    }

//    To print Medicine_Generic info

    public void Medicine_Generic_info(){
        System.out.println("Medicine_Generic_Name : "+Medicine_Generic_Name);
        System.out.println("Medicine_Generic_Manufracture : "+Medicine_Generic_Manufracture);
        System.out.println("Medicine_Generic_Use : "+Medicine_Generic_Use);
        System.out.println("Medicine_Generic_MfgNO : "+Medicine_Generic_MfgNO);
        System.out.println("Medicine_Generic_MfgDate : "+Medicine_Generic_MfgDate);
        System.out.println("Medicine_Generic_Mfg_Loc : "+Medicine_Generic_Mfg_Loc);
        System.out.println("Medicine_Generic_price : "+Medicine_Generic_price);
        System.out.println("Medicine_Generic_Power : "+Medicine_Generic_Power);
    }

}

//=====================================================================================================================================================

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      Hospital object
//        Hospital H = new Hospital("Life-care","Thane",2000000.0,4522122.222);
//
////        To print Hospital info
//
//        H.Hospital_info();
////
//        Pharmacy P = new Pharmacy("Life-Care","Thane",4555555.25);
////      To print Pharmacy details
//        P.Pharmacy_info();

//        --------------------------------accounts data -----------------------------------------------------------------------------

        List<Accounts> accountsList = new ArrayList<>();

        accountsList.add(new Accounts("John Doe", 5000, "Cardiology", "MD", 5.0, "Heart"));
        accountsList.add(new Accounts("Jane Smith", 7500, "Neurology", "MD", 7.5, "Brain"));
        accountsList.add(new Accounts("Michael Johnson", 6000, "Dermatology", "MBBS", 4.0, "Skin"));
        accountsList.add(new Accounts("Emily Williams", 8500, "Orthopedics", "MS", 6.5, "Bones"));
        accountsList.add(new Accounts("David Brown", 4800, "ENT", "MBBS", 5.5, "Ear"));
        accountsList.add(new Accounts("Sophia Lee", 6300, "Ophthalmology", "MD", 6.0, "Eye"));
        accountsList.add(new Accounts("Oliver Davis", 5600, "Gastroenterology", "MD", 3.5, "Digestive System"));
        accountsList.add(new Accounts("Isabella Wilson", 7200, "Pediatrics", "MD", 4.5, "Children's Health"));
        accountsList.add(new Accounts("James Johnson", 5400, "Pulmonology", "MBBS", 7.0, "Lungs"));
        accountsList.add(new Accounts("Ava Martin", 6900, "Urology", "MS", 5.0, "Urinary System"));
        accountsList.add(new Accounts("William Thompson", 7100, "Rheumatology", "MD", 8.5, "Joints"));
        accountsList.add(new Accounts("Emma Anderson", 5700, "Endocrinology", "MD", 4.0, "Hormones"));
        accountsList.add(new Accounts("Liam Garcia", 6600, "Hematology", "MBBS", 6.5, "Blood"));
        accountsList.add(new Accounts("Mia Martinez", 6800, "Nephrology", "MD", 5.5, "Kidneys"));
        accountsList.add(new Accounts("Noah Hernandez", 5900, "Oncology", "MD", 3.0, "Cancer"));
        accountsList.add(new Accounts("Olivia Robinson", 5700, "Dentistry", "DDS", 6.0, "Teeth"));
        accountsList.add(new Accounts("Ethan Lewis", 5400, "Gynecology", "MD", 4.5, "Female Reproductive System"));
        accountsList.add(new Accounts("Aiden Allen", 6200, "Hepatology", "MD", 5.0, "Liver"));
        accountsList.add(new Accounts("Amelia Scott", 5700, "Immunology", "MD", 7.5, "Immune System"));
        accountsList.add(new Accounts("Benjamin Green", 7300, "Psychiatry", "MD", 3.5, "Mental Health"));
        accountsList.add(new Accounts("Harper King", 6800, "Rheumatology", "MD", 6.0, "Joints"));
        accountsList.add(new Accounts("Lucas Baker", 5900, "Urology", "MS", 5.5, "Urinary System"));
        accountsList.add(new Accounts("Evelyn Ward", 7100, "Endocrinology", "MD", 4.0, "Hormones"));
        accountsList.add(new Accounts("Zoey Cox", 6600, "Hematology", "MBBS", 6.5, "Blood"));
        accountsList.add(new Accounts("Alexander Murphy", 6800, "Nephrology", "MD", 5.5, "Kidneys"));
        accountsList.add(new Accounts("Victoria Richardson", 5900, "Oncology", "MD", 3.0, "Cancer"));
        accountsList.add(new Accounts("Luke Rivera", 5700, "Dentistry", "DDS", 6.0, "Teeth"));
        accountsList.add(new Accounts("Madison Ross", 5400, "Gynecology", "MD", 4.5, "Female Reproductive System"));
        accountsList.add(new Accounts("Henry Coleman", 6200, "Hepatology", "MD", 5.0, "Liver"));
        accountsList.add(new Accounts("Grace Morgan", 5700, "Immunology", "MD", 7.5, "Immune System"));
        accountsList.add(new Accounts("Leo Peterson", 7300, "Psychiatry", "MD", 3.5, "Mental Health"));
        accountsList.add(new Accounts("Chloe Reed", 6800, "Rheumatology", "MD", 6.0, "Joints"));
        accountsList.add(new Accounts("Gabriel Wood", 5900, "Urology", "MS", 5.5, "Urinary System"));
        accountsList.add(new Accounts("Addison Stewart", 7100, "Endocrinology", "MD", 4.0, "Hormones"));
        accountsList.add(new Accounts("Bentley Cox", 6600, "Hematology", "MBBS", 6.5, "Blood"));
        accountsList.add(new Accounts("Paisley Bailey", 6800, "Nephrology", "MD", 5.5, "Kidneys"));
        accountsList.add(new Accounts("Jonathan Hill", 5900, "Oncology", "MD", 3.0, "Cancer"));
        accountsList.add(new Accounts("Nora Simmons", 5700, "Dentistry", "DDS", 6.0, "Teeth"));
        accountsList.add(new Accounts("Carter Rogers", 5400, "Gynecology", "MD", 4.5, "Female Reproductive System"));
        accountsList.add(new Accounts("Sadie Price", 6200, "Hepatology", "MD", 5.0, "Liver"));
        accountsList.add(new Accounts("Owen Wood", 5700, "Immunology", "MD", 7.5, "Immune System"));
        accountsList.add(new Accounts("Aria Foster", 7300, "Psychiatry", "MD", 3.5, "Mental Health"));
        accountsList.add(new Accounts("Wyatt Bryant", 6800, "Rheumatology", "MD", 6.0, "Joints"));
        accountsList.add(new Accounts("Hazel Howard", 5900, "Urology", "MS", 5.5, "Urinary System"));
        accountsList.add(new Accounts("Eli Butler", 7100, "Endocrinology", "MD", 4.0, "Hormones"));
        accountsList.add(new Accounts("Scarlett Jenkins", 6600, "Hematology", "MBBS", 6.5, "Blood"));
        accountsList.add(new Accounts("Maverick Hamilton", 6800, "Nephrology", "MD", 5.5, "Kidneys"));
        accountsList.add(new Accounts("Lily Foster", 5900, "Oncology", "MD", 3.0, "Cancer"));
        accountsList.add(new Accounts("Grayson Long", 5700, "Dentistry", "DDS", 6.0, "Teeth"));
        accountsList.add(new Accounts("Aurora Simmons", 5400, "Gynecology", "MD", 4.5, "Female Reproductive System"));

        // You now have a list containing all the created Accounts objects
        // Do further processing with the list as needed

//----------------------------------- Hospital staff data ---------------------------------------------------------------

        List<Management_staff> managementStaffList = new ArrayList<>();

        managementStaffList.add(new Management_staff("John Doe", 50000, 30, "Male"));
        managementStaffList.add(new Management_staff("Jane Smith", 75000, 35, "Female"));
        managementStaffList.add(new Management_staff("Michael Johnson", 60000, 28, "Male"));
        managementStaffList.add(new Management_staff("Emily Williams", 85000, 32, "Female"));
        managementStaffList.add(new Management_staff("David Brown", 48000, 27, "Male"));
        managementStaffList.add(new Management_staff("Sophia Lee", 63000, 29, "Female"));
        managementStaffList.add(new Management_staff("Oliver Davis", 56000, 31, "Male"));
        managementStaffList.add(new Management_staff("Isabella Wilson", 72000, 34, "Female"));
        managementStaffList.add(new Management_staff("James Johnson", 54000, 33, "Male"));
        managementStaffList.add(new Management_staff("Ava Martin", 69000, 30, "Female"));
        managementStaffList.add(new Management_staff("William Thompson", 71000, 32, "Male"));
        managementStaffList.add(new Management_staff("Emma Anderson", 57000, 28, "Female"));
        managementStaffList.add(new Management_staff("Liam Garcia", 66000, 31, "Male"));
        managementStaffList.add(new Management_staff("Mia Martinez", 68000, 29, "Female"));
        managementStaffList.add(new Management_staff("Noah Hernandez", 59000, 33, "Male"));
        managementStaffList.add(new Management_staff("Olivia Robinson", 57000, 27, "Female"));
        managementStaffList.add(new Management_staff("Ethan Lewis", 54000, 31, "Male"));
        managementStaffList.add(new Management_staff("Aiden Allen", 62000, 29, "Female"));
        managementStaffList.add(new Management_staff("Amelia Scott", 57000, 32, "Male"));
        managementStaffList.add(new Management_staff("Benjamin Green", 73000, 30, "Female"));
        managementStaffList.add(new Management_staff("Harper King", 68000, 33, "Male"));
        managementStaffList.add(new Management_staff("Lucas Baker", 59000, 28, "Female"));
        managementStaffList.add(new Management_staff("Evelyn Ward", 71000, 31, "Male"));
        managementStaffList.add(new Management_staff("Zoey Cox", 66000, 29, "Female"));
        managementStaffList.add(new Management_staff("Alexander Murphy", 68000, 32, "Male"));
        managementStaffList.add(new Management_staff("Victoria Richardson", 59000, 30, "Female"));
        managementStaffList.add(new Management_staff("Luke Rivera", 57000, 31, "Male"));
        managementStaffList.add(new Management_staff("Madison Ross", 54000, 28, "Female"));
        managementStaffList.add(new Management_staff("Henry Coleman", 62000, 29, "Male"));
        managementStaffList.add(new Management_staff("Grace Morgan", 57000, 33, "Female"));
        managementStaffList.add(new Management_staff("Leo Peterson", 73000, 31, "Male"));
        managementStaffList.add(new Management_staff("Chloe Reed", 68000, 30, "Female"));
        managementStaffList.add(new Management_staff("Gabriel Wood", 59000, 28, "Male"));
        managementStaffList.add(new Management_staff("Addison Stewart", 71000, 29, "Female"));
        managementStaffList.add(new Management_staff("Bentley Cox", 66000, 32, "Male"));
        managementStaffList.add(new Management_staff("Paisley Bailey", 68000, 30, "Female"));
        managementStaffList.add(new Management_staff("Jonathan Hill", 59000, 31, "Male"));
        managementStaffList.add(new Management_staff("Nora Simmons", 57000, 29, "Female"));
        managementStaffList.add(new Management_staff("Carter Rogers", 54000, 32, "Male"));
        managementStaffList.add(new Management_staff("Sadie Price", 62000, 30, "Female"));
        managementStaffList.add(new Management_staff("Owen Wood", 57000, 31, "Male"));
        managementStaffList.add(new Management_staff("Aria Foster", 73000, 29, "Female"));
        managementStaffList.add(new Management_staff("Wyatt Bryant", 68000, 32, "Male"));
        managementStaffList.add(new Management_staff("Hazel Howard", 59000, 30, "Female"));
        managementStaffList.add(new Management_staff("Eli Butler", 71000, 31, "Male"));
        managementStaffList.add(new Management_staff("Scarlett Jenkins", 66000, 29, "Female"));
        managementStaffList.add(new Management_staff("Maverick Hamilton", 68000, 32, "Male"));
        managementStaffList.add(new Management_staff("Lily Foster", 59000, 30, "Female"));
        managementStaffList.add(new Management_staff("Grayson Long", 57000, 31, "Male"));
        managementStaffList.add(new Management_staff("Aurora Simmons", 54000, 29, "Female"));

//        --------------------------------------- insurance data ---------------------------------------------------------------------

        List<Insurance> InsuranceList = new ArrayList<>();

        InsuranceList.add(new Insurance("John Doe", "Male", 35, "Heart Disease", 5000));
        InsuranceList.add(new Insurance("Jane Smith", "Female", 28, "Cancer", 7500));
        InsuranceList.add(new Insurance("Michael Johnson", "Male", 45, "Diabetes", 6000));
        InsuranceList.add(new Insurance("Emily Williams", "Female", 40, "Stroke", 8500));
        InsuranceList.add(new Insurance("David Brown", "Male", 55, "Arthritis", 4800));
        InsuranceList.add(new Insurance("Sophia Lee", "Female", 32, "Asthma", 6300));
        InsuranceList.add(new Insurance("Oliver Davis", "Male", 38, "Allergy", 5600));
        InsuranceList.add(new Insurance("Isabella Wilson", "Female", 41, "Depression", 7200));
        InsuranceList.add(new Insurance("James Johnson", "Male", 50, "Anxiety", 5400));
        InsuranceList.add(new Insurance("Ava Martin", "Female", 31, "Migraine", 6900));
        InsuranceList.add(new Insurance("William Thompson", "Male", 36, "Back Pain", 7100));
        InsuranceList.add(new Insurance("Emma Anderson", "Female", 29, "Insomnia", 5700));
        InsuranceList.add(new Insurance("Liam Garcia", "Male", 42, "Hypertension", 6600));
        InsuranceList.add(new Insurance("Mia Martinez", "Female", 34, "Diarrhea", 6800));
        InsuranceList.add(new Insurance("Noah Hernandez", "Male", 30, "Fever", 5900));
        InsuranceList.add(new Insurance("Olivia Robinson", "Female", 39, "Common Cold", 5700));
        InsuranceList.add(new Insurance("Ethan Lewis", "Male", 26, "Flu", 5400));
        InsuranceList.add(new Insurance("Aiden Allen", "Female", 37, "Pneumonia", 6200));
        InsuranceList.add(new Insurance("Amelia Scott", "Male", 33, "Sinusitis", 5700));
        InsuranceList.add(new Insurance("Benjamin Green", "Female", 44, "Tonsillitis", 7300));
        InsuranceList.add(new Insurance("Harper King", "Male", 27, "Bronchitis", 6800));
        InsuranceList.add(new Insurance("Lucas Baker", "Female", 48, "Ear Infection", 5900));
        InsuranceList.add(new Insurance("Evelyn Ward", "Male", 32, "Pink Eye", 7100));
        InsuranceList.add(new Insurance("Zoey Cox", "Female", 45, "Stomach Flu", 6600));
        InsuranceList.add(new Insurance("Alexander Murphy", "Male", 29, "Food Poisoning", 6800));
        InsuranceList.add(new Insurance("Victoria Richardson", "Female", 37, "UTI", 5900));
        InsuranceList.add(new Insurance("Luke Rivera", "Male", 30, "Kidney Stone", 5700));
        InsuranceList.add(new Insurance("Madison Ross", "Female", 46, "Appendicitis", 5400));
        InsuranceList.add(new Insurance("Henry Coleman", "Male", 35, "Headache", 6200));
        InsuranceList.add(new Insurance("Grace Morgan", "Female", 28, "Toothache", 5700));
        InsuranceList.add(new Insurance("Leo Peterson", "Male", 41, "Sprained Ankle", 7300));
        InsuranceList.add(new Insurance("Chloe Reed", "Female", 39, "Fractured Arm", 6800));
        InsuranceList.add(new Insurance("Gabriel Wood", "Male", 32, "Burns", 5900));
        InsuranceList.add(new Insurance("Addison Stewart", "Female", 27, "Cuts and Scrapes", 7100));
        InsuranceList.add(new Insurance("Bentley Cox", "Male", 44, "Rash", 6600));
        InsuranceList.add(new Insurance("Paisley Bailey", "Female", 36, "Eczema", 6800));
        InsuranceList.add(new Insurance("Jonathan Hill", "Male", 30, "Psoriasis", 5900));
        InsuranceList.add(new Insurance("Nora Simmons", "Female", 38, "Acne", 5700));
        InsuranceList.add(new Insurance("Carter Rogers", "Male", 31, "Sunburn", 5400));
        InsuranceList.add(new Insurance("Sadie Price", "Female", 43, "Allergic Reaction", 6200));
        InsuranceList.add(new Insurance("Owen Wood", "Male", 29, "Asthma", 5700));
        InsuranceList.add(new Insurance("Aria Foster", "Female", 35, "Epilepsy", 7300));
        InsuranceList.add(new Insurance("Wyatt Bryant", "Male", 47, "Seizures", 6800));
        InsuranceList.add(new Insurance("Hazel Howard", "Female", 33, "Anemia", 5900));
        InsuranceList.add(new Insurance("Eli Butler", "Male", 40, "Hemophilia", 7100));
        InsuranceList.add(new Insurance("Scarlett Jenkins", "Female", 28, "Leukemia", 6600));
        InsuranceList.add(new Insurance("Maverick Hamilton", "Male", 45, "Asthma", 6800));
        InsuranceList.add(new Insurance("Lily Foster", "Female", 42, "Heart Disease", 5900));
        InsuranceList.add(new Insurance("Grayson Long", "Male", 39, "Cancer", 5700));
        InsuranceList.add(new Insurance("Aurora Simmons", "Female", 37, "Diabetes", 5400));

//      ----------------------------------------------------Departments data ------------------------------------------------------

        List <Departments> DepartmentsList = new ArrayList<>();

        DepartmentsList.add(new Departments("Cardiology", "MD", 5.0, "Heart"));
        DepartmentsList.add(new Departments("Neurology", "MD", 7.5, "Brain"));
        DepartmentsList.add(new Departments("Dermatology", "MBBS", 4.0, "Skin"));
        DepartmentsList.add(new Departments("Orthopedics", "MS", 6.5, "Bones"));
        DepartmentsList.add(new Departments("ENT", "MBBS", 5.5, "Ear"));
        DepartmentsList.add(new Departments("Ophthalmology", "MD", 6.0, "Eye"));
        DepartmentsList.add(new Departments("Gastroenterology", "MD", 3.5, "Digestive System"));
        DepartmentsList.add(new Departments("Pediatrics", "MD", 4.5, "Children's Health"));
        DepartmentsList.add(new Departments("Pulmonology", "MBBS", 7.0, "Lungs"));
        DepartmentsList.add(new Departments("Urology", "MS", 5.0, "Urinary System"));
        DepartmentsList.add(new Departments("Rheumatology", "MD", 8.5, "Joints"));
        DepartmentsList.add(new Departments("Endocrinology", "MD", 4.0, "Hormones"));
        DepartmentsList.add(new Departments("Hematology", "MBBS", 6.5, "Blood"));
        DepartmentsList.add(new Departments("Nephrology", "MD", 5.5, "Kidneys"));
        DepartmentsList.add(new Departments("Oncology", "MD", 3.0, "Cancer"));
        DepartmentsList.add(new Departments("Dentistry", "DDS", 6.0, "Teeth"));
        DepartmentsList.add(new Departments("Gynecology", "MD", 4.5, "Female Reproductive System"));
        DepartmentsList.add(new Departments("Hepatology", "MD", 5.0, "Liver"));
        DepartmentsList.add(new Departments("Immunology", "MD", 7.5, "Immune System"));
        DepartmentsList.add(new Departments("Psychiatry", "MD", 3.5, "Mental Health"));
        DepartmentsList.add(new Departments("Rheumatology", "MD", 6.0, "Joints"));
        DepartmentsList.add(new Departments("Urology", "MS", 5.5, "Urinary System"));
        DepartmentsList.add(new Departments("Endocrinology", "MD", 4.0, "Hormones"));
        DepartmentsList.add(new Departments("Hematology", "MBBS", 6.5, "Blood"));
        DepartmentsList.add(new Departments("Nephrology", "MD", 5.5, "Kidneys"));
        DepartmentsList.add(new Departments("Oncology", "MD", 3.0, "Cancer"));
        DepartmentsList.add(new Departments("Dentistry", "DDS", 6.0, "Teeth"));
        DepartmentsList.add(new Departments("Gynecology", "MD", 4.5, "Female Reproductive System"));
        DepartmentsList.add(new Departments("Hepatology", "MD", 5.0, "Liver"));
        DepartmentsList.add(new Departments("Immunology", "MD", 7.5, "Immune System"));
        DepartmentsList.add(new Departments("Psychiatry", "MD", 3.5, "Mental Health"));
        DepartmentsList.add(new Departments("Rheumatology", "MD", 6.0, "Joints"));
        DepartmentsList.add(new Departments("Urology", "MS", 5.5, "Urinary System"));
        DepartmentsList.add(new Departments("Endocrinology", "MD", 4.0, "Hormones"));
        DepartmentsList.add(new Departments("Hematology", "MBBS", 6.5, "Blood"));
        DepartmentsList.add(new Departments("Nephrology", "MD", 5.5, "Kidneys"));
        DepartmentsList.add(new Departments("Oncology", "MD", 3.0, "Cancer"));
        DepartmentsList.add(new Departments("Dentistry", "DDS", 6.0, "Teeth"));
        DepartmentsList.add(new Departments("Gynecology", "MD", 4.5, "Female Reproductive System"));
        DepartmentsList.add(new Departments("Hepatology", "MD", 5.0, "Liver"));
        DepartmentsList.add(new Departments("Immunology", "MD", 7.5, "Immune System"));
        DepartmentsList.add(new Departments("Psychiatry", "MD", 3.5, "Mental Health"));
        DepartmentsList.add(new Departments("Rheumatology", "MD", 6.0, "Joints"));
        DepartmentsList.add(new Departments("Urology", "MS", 5.5, "Urinary System"));
        DepartmentsList.add(new Departments("Endocrinology", "MD", 4.0, "Hormones"));
        DepartmentsList.add(new Departments("Hematology", "MBBS", 6.5, "Blood"));
        DepartmentsList.add(new Departments("Nephrology", "MD", 5.5, "Kidneys"));
        DepartmentsList.add(new Departments("Oncology", "MD", 3.0, "Cancer"));
        DepartmentsList.add(new Departments("Dentistry", "DDS", 6.0, "Teeth"));
        DepartmentsList.add(new Departments("Gynecology", "MD", 4.5, "Female Reproductive System"));
        DepartmentsList.add(new Departments("Hepatology", "MD", 5.0, "Liver"));
        DepartmentsList.add(new Departments("Immunology", "MD", 7.5, "Immune System"));
        DepartmentsList.add(new Departments("Psychiatry", "MD", 3.5, "Mental Health"));

//---------------------------------------------------Manage_Accouts_data(deparment expenses)-------------------------------------------------------------------------------

        List<Manage_Accouts> Manage_Accouts_Lists = new ArrayList<>();

        Manage_Accouts_Lists.add(new Manage_Accouts("Medicine","UPI",20000,"cardio","Kiran"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Medicine", "UPI", 20000, "cardio", "Kiran"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Surgery", "Cash", 15000, "ortho", "John"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Pediatrics", "Cheque", 18000, "pediatric", "Emily"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Dermatology", "UPI", 21000, "derma", "Michael"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Oncology", "Credit Card", 24000, "cancer", "Sophia"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Neurology", "Cash", 17000, "neuro", "Oliver"));
        Manage_Accouts_Lists.add(new Manage_Accouts("ENT", "Cheque", 22000, "ent", "Isabella"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Gastroenterology", "UPI", 19000, "gastro", "James"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Orthopedics", "Cash", 16000, "ortho", "David"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Urology", "Credit Card", 23000, "uro", "Olivia"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Ophthalmology", "UPI", 20000, "ophthalmology", "Ava"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Cardiology", "Cash", 21000, "heart", "William"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Endocrinology", "Cheque", 18000, "endocrinology", "Emma"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Hematology", "UPI", 22000, "blood", "Liam"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Nephrology", "Credit Card", 19000, "kidney", "Mia"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Gynecology", "Cash", 24000, "gyno", "Noah"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Psychiatry", "Cheque", 17000, "psychiatry", "Olivia"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Rheumatology", "UPI", 20000, "rheumatology", "Ethan"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Hepatology", "Cash", 21000, "liver", "Aiden"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Immunology", "Credit Card", 18000, "immune", "Amelia"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Dentistry", "UPI", 23000, "dent", "Benjamin"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Radiology", "Cash", 19000, "radio", "Harper"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Pathology", "Cheque", 22000, "patho", "Lucas"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Physical Therapy", "UPI", 16000, "pt", "Evelyn"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Pulmonology", "Credit Card", 23000, "lungs", "Zoey"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Allergy and Immunology", "Cash", 20000, "allergy", "Alexander"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Anesthesiology", "Cheque", 19000, "anesthesia", "Victoria"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Cardiac Electrophysiology", "UPI", 17000, "heart", "Luke"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Cardiovascular Disease", "Credit Card", 21000, "heart", "Madison"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Critical Care Medicine", "Cash", 18000, "critical", "Henry"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Dermatopathology", "Cheque", 22000, "derma", "Grace"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Emergency Medicine", "UPI", 19000, "emergency", "Leo"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Endovascular Surgical Neuroradiology", "Credit Card", 24000, "endovascular", "Chloe"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Family Medicine", "Cash", 21000, "family", "Gabriel"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Gastrointestinal Surgery", "Cheque", 16000, "gastro", "Addison"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Geriatric Medicine", "UPI", 22000, "geriatric", "Bentley"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Gynecologic Oncology", "Credit Card", 20000, "gyno", "Paisley"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Hospice and Palliative Medicine", "Cash", 17000, "hospice", "Jonathan"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Hyperbaric Medicine", "Cheque", 21000, "hyperbaric", "Nora"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Infectious Disease", "UPI", 19000, "infectious", "Carter"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Integrative Medicine", "Credit Card", 23000, "integrative", "Sadie"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Internal Medicine", "Cash", 20000, "internal", "Owen"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Interventional Cardiology", "Cheque", 22000, "heart", "Aria"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Neonatology", "UPI", 17000, "neonatal", "Wyatt"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Nuclear Medicine", "Credit Card", 18000, "nuclear", "Hazel"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Obstetrics and Gynecology", "Cash", 19000, "obgyn", "Eli"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Occupational Medicine", "Cheque", 23000, "occupational", "Scarlett"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Oncology and Hematology", "UPI", 20000, "oncohem", "Maverick"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Ophthalmic Plastic and Reconstructive Surgery", "Credit Card", 17000, "ophthalmic", "Lily"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Oral and Maxillofacial Surgery", "Cash", 18000, "oralmax", "Grayson"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Orthopaedic Sports Medicine", "Cheque", 22000, "ortho", "Aurora"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Pain Medicine", "UPI", 19000, "pain", "Mia"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Pathology-Anatomic and Clinical", "Credit Card", 21000, "patho", "Noah"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Pediatric Cardiology", "Cash", 16000, "pediatric", "Emma"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Pediatric Critical Care Medicine", "Cheque", 23000, "pediatric", "Liam"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Pediatric Emergency Medicine", "UPI", 20000, "pediatric", "Olivia"));
        Manage_Accouts_Lists.add(new Manage_Accouts("Pediatric Endocrinology", "Credit Card", 21000, "pediatric", "Ethan"));

//      --------------------------------------------------Pharmacy staff data-------------------------------------------------------------

        List<Pharmacy_Staff>Pharmacy_Staff_List = new ArrayList<>();

        Pharmacy_Staff_List.add(new Pharmacy_Staff("Kiran",45200,"Pharmist",4.0));
        Pharmacy_Staff_List.add(new Pharmacy_Staff("John", 50000, "Pharmacist", 5.5));
        Pharmacy_Staff_List.add(new Pharmacy_Staff("Emily", 48000, "Pharmacy Technician", 3.0));
        Pharmacy_Staff_List.add(new Pharmacy_Staff("Michael", 52000, "Pharmacist", 6.0));
        Pharmacy_Staff_List.add(new Pharmacy_Staff("Sophia", 53000, "Pharmacy Technician", 4.5));
        Pharmacy_Staff_List.add(new Pharmacy_Staff("David", 49000, "Pharmacist", 5.0));
        Pharmacy_Staff_List.add(new Pharmacy_Staff("Oliver", 51000, "Pharmacy Technician", 4.0));
        Pharmacy_Staff_List.add(new Pharmacy_Staff("Isabella", 54000, "Pharmacist", 6.5));
        Pharmacy_Staff_List.add(new Pharmacy_Staff("James", 48000, "Pharmacy Technician", 3.5));
        Pharmacy_Staff_List.add(new Pharmacy_Staff("Ava", 53000, "Pharmacist", 5.0));
        Pharmacy_Staff_List.add(new Pharmacy_Staff("William", 55000, "Pharmacy Technician", 4.0));
        Pharmacy_Staff_List.add(new Pharmacy_Staff("Mandar",15000,"Helper",2.0));
        Pharmacy_Staff_List.add(new Pharmacy_Staff("Shreepad",20000,"Helper",2.0));
        Pharmacy_Staff_List.add(new Pharmacy_Staff("Sham",15000,"Loader",5.0));

//        -----------------------------------------------------Pharmacy medicine/dealer  list-----------------------------------------------------------

        List<Pharmacy_Medicine> Pharmacy_Medicine_List = new ArrayList<>();

        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("Aghrawal",50000,"Mumbai",4.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("PharmaWorld", 55000, "New York", 4.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediCo", 48000, "Los Angeles", 3.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("HealthPlus", 52000, "Chicago", 5.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MedLife", 53000, "Houston", 4.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("CareWell", 49000, "Phoenix", 4.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediPlus", 51000, "Philadelphia", 3.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("PharmaCare", 54000, "San Antonio", 5.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("HealthyChoice", 48000, "San Diego", 3.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("VitaMed", 53000, "Dallas", 5.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediHelp", 55000, "San Jose", 4.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediZone", 48000, "Austin", 4.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("PharmaCare Plus", 51000, "Fort Worth", 3.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediHealth", 54000, "Jacksonville", 5.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("HealthyLife", 53000, "Columbus", 4.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("PharmaMart", 49000, "Charlotte", 3.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediExpress", 52000, "San Francisco", 5.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediCure", 48000, "Indianapolis", 4.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("CareLife", 51000, "Seattle", 3.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("PharmaMed", 54000, "Denver", 5.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("HealthyMeds", 53000, "Washington, D.C.", 4.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediShop", 55000, "Boston", 4.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("VitaLife", 48000, "El Paso", 3.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediWell", 52000, "Nashville", 5.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("PharmaHub", 53000, "Detroit", 4.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediCare", 49000, "Oklahoma City", 4.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("HealthMeds", 51000, "Portland", 3.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediWorld", 54000, "Las Vegas", 5.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("CarePlus", 53000, "Memphis", 4.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("PharmaMedic", 48000, "Louisville", 3.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediAid", 52000, "Baltimore", 5.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("HealthyMeds Plus", 53000, "Milwaukee", 4.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediPro", 49000, "Albuquerque", 3.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("PharmaDose", 51000, "Tucson", 5.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediRise", 54000, "Fresno", 4.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("CareLife Plus", 53000, "Sacramento", 4.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediWellness", 55000, "Long Beach", 3.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("PharmaCure", 48000, "Kansas City", 5.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediHealth Plus", 52000, "Mesa", 4.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("HealthyLiving", 54000, "Atlanta", 3.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediMedic", 53000, "Virginia Beach", 5.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("PharmaPlus", 49000, "Omaha", 4.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediHub", 51000, "Raleigh", 3.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("CareMed", 54000, "Miami", 5.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("HealthyChoice", 53000, "Tulsa", 4.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediPharm", 48000, "Oakland", 4.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("VitaCare", 52000, "Cleveland", 3.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediVita", 53000, "Arlington", 5.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("PharmaExpress", 49000, "New Orleans", 4.0));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("CareWorld", 51000, "Wichita", 3.5));
        Pharmacy_Medicine_List.add(new Pharmacy_Medicine("MediCare Plus", 54000, "Bakersfield", 5.0));

//        -------------------------------------------Medicine Branded data --------------------------------

        List<Medicene_Branded> Medicene_Branded_List = new ArrayList<>();

        Medicene_Branded_List.add(new Medicene_Branded("Panadol", "ABC Pharmaceuticals", "Painkiller", 73529174, "2023-08-15", "New York", 30, 250));
        Medicene_Branded_List.add(new Medicene_Branded("Advil", "XYZ Pharmaceuticals", "Painkiller", 82913756, "2023-09-01", "London", 60, 400));
        Medicene_Branded_List.add(new Medicene_Branded("Claritin", "Medico Labs", "Antihistamine", 23897145, "2023-07-25", "Berlin", 20, 10));
        Medicene_Branded_List.add(new Medicene_Branded("Nexium", "Alpha Meds", "Proton Pump Inhibitor", 52918374, "2023-08-30", "Paris", 90, 20));
        Medicene_Branded_List.add(new Medicene_Branded("Glucophage", "HealthCare Inc.", "Antidiabetic", 72934716, "2023-06-10", "Tokyo", 120, 500));
        Medicene_Branded_List.add(new Medicene_Branded("Lipitor", "BioPharma Corp.", "Statin", 36192874, "2023-09-12", "Sydney", 60, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Zithromax", "MediGen", "Antibiotic", 87923456, "2023-07-18", "Toronto", 10, 250));
        Medicene_Branded_List.add(new Medicene_Branded("Zyrtec", "GlobalHealth", "Antihistamine", 23894567, "2023-06-05", "Mumbai", 40, 5));
        Medicene_Branded_List.add(new Medicene_Branded("Cozaar", "PharmaWorld", "Angiotensin Receptor Blocker", 19283746, "2023-08-22", "Delhi", 30, 50));
        Medicene_Branded_List.add(new Medicene_Branded("Zoloft", "HealthWell", "SSRI", 83746192, "2023-09-30", "Bangalore", 90, 100));
        Medicene_Branded_List.add(new Medicene_Branded("Xanax", "MedicalCo", "Benzodiazepine", 19283745, "2023-07-07", "Chennai", 50, 0.5));
        Medicene_Branded_List.add(new Medicene_Branded("Prozac", "MediCare Solutions", "SSRI", 56293847, "2023-08-18", "Singapore", 45, 20));
        Medicene_Branded_List.add(new Medicene_Branded("Ceftin", "PharmaNext", "Cephalosporin", 19827364, "2023-06-29", "Hong Kong", 20, 500));
        Medicene_Branded_List.add(new Medicene_Branded("Levaquin", "MediPlus", "Fluoroquinolone", 10928374, "2023-09-05", "Seoul", 30, 750));
        Medicene_Branded_List.add(new Medicene_Branded("Vibramycin", "BioCure", "Tetracycline", 19827465, "2023-07-12", "Beijing", 60, 100));
        Medicene_Branded_List.add(new Medicene_Branded("Cipro", "PharmaDose", "Fluoroquinolone", 12934876, "2023-08-28", "Shanghai", 20, 750));
        Medicene_Branded_List.add(new Medicene_Branded("Singulair", "HealthCare Solutions", "Leukotriene Modifier", 10928734, "2023-06-19", "Dubai", 30, 10));
        Medicene_Branded_List.add(new Medicene_Branded("Norvasc", "MedLife", "Calcium Channel Blocker", 19827345, "2023-08-03", "Moscow", 90, 5));
        Medicene_Branded_List.add(new Medicene_Branded("Lopressor", "PharmaCare", "Beta-blocker", 12938476, "2023-07-21", "Istanbul", 60, 50));
        Medicene_Branded_List.add(new Medicene_Branded("Paxil", "MediHelp", "SSRI", 23847916, "2023-09-17", "Rome", 30, 30));
        Medicene_Branded_List.add(new Medicene_Branded("Aciphex", "HealthMed", "Proton Pump Inhibitor", 23948761, "2023-08-07", "Athens", 45, 20));
        Medicene_Branded_List.add(new Medicene_Branded("Zocor", "BioMeds", "Statin", 38192874, "2023-06-24", "Cairo", 120, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Valium", "PharmaMasters", "Benzodiazepine", 92384716, "2023-08-11", "Johannesburg", 10, 2));
        Medicene_Branded_List.add(new Medicene_Branded("Prednisone", "MediHealth", "Corticosteroid", 28374961, "2023-09-28", "Sao Paulo", 20, 5));
        Medicene_Branded_List.add(new Medicene_Branded("Flagyl", "PharmaCure", "Nitroimidazole", 19283645, "2023-07-02", "Mexico City", 30, 250));
        Medicene_Branded_List.add(new Medicene_Branded("Celebrex", "BioCure", "NSAID", 83294671, "2023-09-14", "Los Angeles", 40, 200));
        Medicene_Branded_List.add(new Medicene_Branded("Benadryl", "MediSolutions", "Antihist",4521421,"2024-04-14","New York",451,200));
        Medicene_Branded_List.add(new Medicene_Branded("Benadryl", "MediSolutions", "Antihistamine", 73618492, "2023-08-25", "Chicago", 25, 50));
        Medicene_Branded_List.add(new Medicene_Branded("Motrin", "HealthCare Inc.", "NSAID", 29873465, "2023-07-17", "Houston", 15, 150));
        Medicene_Branded_List.add(new Medicene_Branded("Aleve", "PharmaNext", "NSAID", 81934762, "2023-09-20", "Miami", 20, 220));
        Medicene_Branded_List.add(new Medicene_Branded("Aspirin", "GlobalHealth", "Painkiller", 74638927, "2023-08-05", "Seattle", 50, 100));
        Medicene_Branded_List.add(new Medicene_Branded("Crestor", "MediGen", "Statin", 23817456, "2023-06-14", "Vancouver", 60, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Singulair", "HealthWell", "Leukotriene Modifier", 81924567, "2023-08-28", "Brisbane", 30, 10));
        Medicene_Branded_List.add(new Medicene_Branded("Ambien", "MediCare Solutions", "Sedative", 98236715, "2023-07-22", "Amsterdam", 25, 10));
        Medicene_Branded_List.add(new Medicene_Branded("Lunesta", "PharmaDose", "Hypnotic", 73819456, "2023-09-12", "Dublin", 30, 5));
        Medicene_Branded_List.add(new Medicene_Branded("Tramadol", "PharmaLife", "Analgesic", 23749861, "2023-08-02", "Stockholm", 40, 50));
        Medicene_Branded_List.add(new Medicene_Branded("Zantac", "HealthMed", "Acid Reducer", 73819256, "2023-07-25", "Vienna", 20, 150));
        Medicene_Branded_List.add(new Medicene_Branded("Cymbalta", "PharmaMasters", "Antidepressant", 23849127, "2023-09-10", "Munich", 45, 30));
        Medicene_Branded_List.add(new Medicene_Branded("Adderall", "MediHealth", "Stimulant", 82918437, "2023-08-18", "Barcelona", 20, 10));
        Medicene_Branded_List.add(new Medicene_Branded("Ritalin", "MediCure", "Stimulant", 83649271, "2023-07-29", "Madrid", 30, 5));
        Medicene_Branded_List.add(new Medicene_Branded("Xarelto", "HealthFirst", "Anticoagulant", 18293647, "2023-09-07", "Lisbon", 40, 20));
        Medicene_Branded_List.add(new Medicene_Branded("Prilosec", "MediWell", "Proton Pump Inhibitor", 73849162, "2023-08-24", "Porto", 50, 15));
        Medicene_Branded_List.add(new Medicene_Branded("Effexor", "PharmaPro", "Antidepressant", 29184736, "2023-07-01", "Zurich", 60, 25));
        Medicene_Branded_List.add(new Medicene_Branded("Zoloft", "BioCure", "Antidepressant", 71829346, "2023-09-13", "Oslo", 15, 30));
        Medicene_Branded_List.add(new Medicene_Branded("Wellbutrin", "MediSolutions", "Antidepressant", 19283675, "2023-08-06", "Helsinki", 20, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Diovan", "HealthCare Inc.", "Antihypertensive", 83619482, "2023-07-19", "Copenhagen", 30, 80));
        Medicene_Branded_List.add(new Medicene_Branded("Zofran", "GlobalHealth", "Antiemetic", 29183675, "2023-09-21", "Stockholm", 45, 8));
        Medicene_Branded_List.add(new Medicene_Branded("Paxil", "HealthWell", "Antidepressant", 82934761, "2023-08-03", "Paris", 60, 12));
        Medicene_Branded_List.add(new Medicene_Branded("Lasix", "PharmaNext", "Diuretic", 19827346, "2023-07-26", "London", 30, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Celebrex", "Alpha Meds", "NSAID", 82746139, "2023-09-14", "Berlin", 20, 120));
        Medicene_Branded_List.add(new Medicene_Branded("Valtrex", "Medico Labs", "Antiviral", 39271846, "2023-08-27", "Amsterdam", 30, 250));
        Medicene_Branded_List.add(new Medicene_Branded("Evista", "BioPharma Corp.", "Selective Estrogen Receptor Modulator", 21938764, "2023-07-09", "Chicago", 45, 50));
        Medicene_Branded_List.add(new Medicene_Branded("Pravachol", "HealthCare Inc.", "Statin", 72849136, "2023-09-24", "New York", 60, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Depakote", "MediGen", "Anticonvulsant", 81938475, "2023-08-02", "Los Angeles", 30, 500));
        Medicene_Branded_List.add(new Medicene_Branded("Seroquel", "MediPlus", "Antipsychotic", 98273461, "2023-07-16", "Dallas", 20, 100));
        Medicene_Branded_List.add(new Medicene_Branded("Coumadin", "HealthCare Solutions", "Anticoagulant", 81927436, "2023-09-30", "Houston", 15, 2));
        Medicene_Branded_List.add(new Medicene_Branded("Cipro", "PharmaCure", "Fluoroquinolone", 73849162, "2023-08-22", "Toronto", 20, 750));
        Medicene_Branded_List.add(new Medicene_Branded("Levitra", "MediHealth", "Erectile Dysfunction", 81938274, "2023-07-05", "Vancouver", 30, 20));
        Medicene_Branded_List.add(new Medicene_Branded("Avandia", "PharmaMed", "Antidiabetic", 12938476, "2023-09-18", "Miami", 40, 30));
        Medicene_Branded_List.add(new Medicene_Branded("Risperdal", "BioCure", "Antipsychotic", 98273164, "2023-08-11", "Sydney", 50, 50));
        Medicene_Branded_List.add(new Medicene_Branded("Protonix", "HealthWell", "Proton Pump Inhibitor", 89273164, "2023-07-25", "Paris", 60, 20));
        Medicene_Branded_List.add(new Medicene_Branded("Effexor", "PharmaNext", "Antidepressant", 21934765, "2023-09-08", "London", 30, 80));
        Medicene_Branded_List.add(new Medicene_Branded("Vioxx", "MediPro", "NSAID", 98273491, "2023-08-13", "Berlin", 20, 100));
        Medicene_Branded_List.add(new Medicene_Branded("Celebrex", "HealthMed", "NSAID", 19283765, "2023-07-26", "Rome", 10, 120));
        Medicene_Branded_List.add(new Medicene_Branded("Zetia", "GlobalHealth", "Cholesterol-lowering", 12938476, "2023-09-14", "Barcelona", 20, 50));
        Medicene_Branded_List.add(new Medicene_Branded("Vicodin", "PharmaPro", "Painkiller", 98236471, "2023-08-09", "Madrid", 25, 10));
        Medicene_Branded_List.add(new Medicene_Branded("Lipitor", "MediLife", "Statin", 23897146, "2023-07-23", "Oslo", 30, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Nexium", "HealthFirst", "Proton Pump Inhibitor", 89174623, "2023-09-17", "Copenhagen", 45, 20));
        Medicene_Branded_List.add(new Medicene_Branded("Symbicort", "PharmaDose", "Bronchodilator", 21983746, "2023-08-03", "Helsinki", 60, 120));
        Medicene_Branded_List.add(new Medicene_Branded("OxyContin", "MediWell", "Opioid", 82746139, "2023-07-19", "Stockholm", 30, 80));
        Medicene_Branded_List.add(new Medicene_Branded("Nasonex", "GlobalHealth", "Corticosteroid", 21983674, "2023-09-12", "Vienna", 20, 5));
        Medicene_Branded_List.add(new Medicene_Branded("Xanax", "PharmaNext", "Benzodiazepine", 21983764, "2023-08-02", "Zurich", 10, 0.5));
        Medicene_Branded_List.add(new Medicene_Branded("Prevacid", "MediPro", "Proton Pump Inhibitor", 21983764, "2023-07-25", "Porto", 20, 15));
        Medicene_Branded_List.add(new Medicene_Branded("Prozac", "HealthWell", "Antidepressant", 21983746, "2023-09-14", "Oslo", 30, 30));
        Medicene_Branded_List.add(new Medicene_Branded("Toprol-XL", "PharmaMed", "Beta-blocker", 82736194, "2023-08-07", "Copenhagen", 60, 25));
        Medicene_Branded_List.add(new Medicene_Branded("Naprosyn", "MediGen", "NSAID", 23897146, "2023-07-24", "Berlin", 20, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Effexor", "Alpha Meds", "Antidepressant", 82734691, "2023-09-30", "London", 30, 30));
        Medicene_Branded_List.add(new Medicene_Branded("Wellbutrin", "MediPlus", "Antidepressant", 23817456, "2023-08-05", "Paris", 20, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Zofran", "HealthMed", "Antiemetic", 82193746, "2023-07-28", "Los Angeles", 30, 8));
        Medicene_Branded_List.add(new Medicene_Branded("Paxil", "MediSolutions", "Antidepressant", 82934761, "2023-09-03", "Dallas", 20, 12));
        Medicene_Branded_List.add(new Medicene_Branded("Lasix", "PharmaCure", "Diuretic", 72847319, "2023-08-20", "Houston", 30, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Crestor", "MediLife", "Statin", 82193746, "2023-07-09", "Toronto", 60, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Depakote", "HealthCare Inc.", "Anticonvulsant", 28391476, "2023-09-24", "Vancouver", 30, 500));
        Medicene_Branded_List.add(new Medicene_Branded("Seroquel", "MediWell", "Antipsychotic", 82174693, "2023-08-11", "Miami", 20, 100));
        Medicene_Branded_List.add(new Medicene_Branded("Coumadin", "PharmaPro", "Anticoagulant", 81934726, "2023-07-30", "Sydney", 15, 2));
        Medicene_Branded_List.add(new Medicene_Branded("Cipro", "MediGen", "Fluoroquinolone", 73849162, "2023-08-22", "Paris", 20, 750));
        Medicene_Branded_List.add(new Medicene_Branded("Levitra", "HealthWell", "Erectile Dysfunction", 81928264, "2023-07-05", "London", 30, 20));
        Medicene_Branded_List.add(new Medicene_Branded("Avandia", "PharmaNext", "Antidiabetic", 12938476, "2023-09-20", "Berlin", 40, 30));
        Medicene_Branded_List.add(new Medicene_Branded("Risperdal", "HealthFirst", "Antipsychotic", 91826374, "2023-08-11", "New York", 50, 50));
        Medicene_Branded_List.add(new Medicene_Branded("Protonix", "MediCure", "Proton Pump Inhibitor", 81927364, "2023-07-25", "Dallas", 60, 20));
        Medicene_Branded_List.add(new Medicene_Branded("Effexor", "PharmaLife", "Antidepressant", 19287346, "2023-09-08", "Houston", 30, 80));
        Medicene_Branded_List.add(new Medicene_Branded("Vioxx", "GlobalHealth", "NSAID", 98374692, "2023-08-13", "Chicago", 20, 100));
        Medicene_Branded_List.add(new Medicene_Branded("Celebrex", "MediSolutions", "NSAID", 98374612, "2023-07-26", "Miami", 10, 120));
        Medicene_Branded_List.add(new Medicene_Branded("Zetia", "HealthMed", "Cholesterol-lowering", 98374621, "2023-09-14", "Los Angeles", 20, 50));
        Medicene_Branded_List.add(new Medicene_Branded("Vicodin", "PharmaPro", "Painkiller", 83629147, "2023-08-09", "Toronto", 25, 10));
        Medicene_Branded_List.add(new Medicene_Branded("Lipitor", "MediGen", "Statin", 21837469, "2023-07-24", "Vancouver", 30, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Nexium", "HealthFirst", "Proton Pump Inhibitor", 73619248, "2023-09-17", "Miami", 45, 20));
        Medicene_Branded_List.add(new Medicene_Branded("Symbicort", "PharmaDose", "Bronchodilator", 83649147, "2023-08-03", "Sydney", 60, 120));
        Medicene_Branded_List.add(new Medicene_Branded("OxyContin", "MediWell", "Opioid", 89247163, "2023-07-19", "Paris", 30, 80));
        Medicene_Branded_List.add(new Medicene_Branded("Nasonex", "GlobalHealth", "Corticosteroid", 82746139, "2023-09-12", "London", 20, 5));
        Medicene_Branded_List.add(new Medicene_Branded("Xanax", "PharmaNext", "Benzodiazepine", 98234617, "2023-08-02", "Zurich", 10, 0.5));
        Medicene_Branded_List.add(new Medicene_Branded("Prednisone", "MediHealth", "Corticosteroid", 29183746, "2023-09-28", "Tokyo", 20, 5));
        Medicene_Branded_List.add(new Medicene_Branded("Flagyl", "PharmaCure", "Nitroimidazole", 92817346, "2023-07-02", "Seoul", 30, 250));
        Medicene_Branded_List.add(new Medicene_Branded("Cymbalta", "HealthMed", "Antidepressant", 72839146, "2023-08-18", "Bangalore", 45, 30));
        Medicene_Branded_List.add(new Medicene_Branded("Lunesta", "MediLife", "Hypnotic", 73641846, "2023-09-15", "Chennai", 30, 5));
        Medicene_Branded_List.add(new Medicene_Branded("Tramadol", "PharmaNext", "Analgesic", 91836475, "2023-08-28", "Mumbai", 40, 50));
        Medicene_Branded_List.add(new Medicene_Branded("Zantac", "HealthWell", "Acid Reducer", 72938164, "2023-07-15", "Delhi", 20, 150));
        Medicene_Branded_List.add(new Medicene_Branded("Zoloft", "MediSolutions", "Antidepressant", 73649182, "2023-09-10", "Singapore", 45, 30));
        Medicene_Branded_List.add(new Medicene_Branded("Lipitor", "PharmaLife", "Statin", 72938746, "2023-08-22", "Hong Kong", 60, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Valium", "GlobalHealth", "Benzodiazepine", 28379146, "2023-07-10", "Shanghai", 10, 2));
        Medicene_Branded_List.add(new Medicene_Branded("Vibramycin", "MediCure", "Tetracycline", 73912846, "2023-09-27", "Beijing", 60, 100));
        Medicene_Branded_List.add(new Medicene_Branded("Cipro", "PharmaMasters", "Fluoroquinolone", 81934762, "2023-08-28", "Tokyo", 20, 750));
        Medicene_Branded_List.add(new Medicene_Branded("Singulair", "HealthMed", "Leukotriene Modifier", 73892146, "2023-07-19", "Seoul", 30, 10));
        Medicene_Branded_List.add(new Medicene_Branded("Norvasc", "PharmaPro", "Calcium Channel Blocker", 21938476, "2023-09-03", "Bangalore", 90, 5));
        Medicene_Branded_List.add(new Medicene_Branded("Lopressor", "MediLife", "Beta-blocker", 29138476, "2023-08-21", "Chennai", 60, 50));
        Medicene_Branded_List.add(new Medicene_Branded("Paxil", "HealthWell", "SSRI", 83749126, "2023-07-17", "Mumbai", 30, 30));
        Medicene_Branded_List.add(new Medicene_Branded("Aciphex", "PharmaNext", "Proton Pump Inhibitor", 29184736, "2023-09-07", "Delhi", 45, 20));
        Medicene_Branded_List.add(new Medicene_Branded("Zocor", "GlobalHealth", "Statin", 81927346, "2023-08-24", "Singapore", 120, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Valium", "PharmaMed", "Benzodiazepine", 81927346, "2023-07-11", "Hong Kong", 10, 2));
        Medicene_Branded_List.add(new Medicene_Branded("Prednisone", "MediCure", "Corticosteroid", 98372641, "2023-09-27", "Shanghai", 20, 5));
        Medicene_Branded_List.add(new Medicene_Branded("Flagyl", "HealthCare Inc.", "Nitroimidazole", 28374196, "2023-08-12", "Beijing", 30, 250));
        Medicene_Branded_List.add(new Medicene_Branded("Effexor", "PharmaDose", "Antidepressant", 19283675, "2023-09-21", "Tokyo", 30, 80));
        Medicene_Branded_List.add(new Medicene_Branded("Nexium", "MediWell", "Proton Pump Inhibitor", 81937465, "2023-08-15", "Seoul", 20, 150));
        Medicene_Branded_List.add(new Medicene_Branded("Symbicort", "PharmaLife", "Bronchodilator", 98274163, "2023-07-08", "Bangalore", 60, 120));
        Medicene_Branded_List.add(new Medicene_Branded("OxyContin", "HealthMed", "Opioid", 21934678, "2023-09-23", "Chennai", 30, 80));
        Medicene_Branded_List.add(new Medicene_Branded("Nasonex", "GlobalHealth", "Corticosteroid", 81927346, "2023-08-10", "Mumbai", 20, 5));
        Medicene_Branded_List.add(new Medicene_Branded("Xanax", "PharmaPro", "Benzodiazepine", 82917654, "2023-07-05", "Delhi", 10, 0.5));
        Medicene_Branded_List.add(new Medicene_Branded("Prevacid", "MediCure", "Proton Pump Inhibitor", 81937642, "2023-09-26", "Singapore", 20, 15));
        Medicene_Branded_List.add(new Medicene_Branded("Prozac", "HealthWell", "Antidepressant", 82736491, "2023-08-19", "Hong Kong", 30, 30));
        Medicene_Branded_List.add(new Medicene_Branded("Wellbutrin", "PharmaNext", "Antidepressant", 19283746, "2023-07-11", "Shanghai", 20, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Zofran", "Alpha Meds", "Antiemetic", 82746193, "2023-09-25", "Beijing", 30, 8));
        Medicene_Branded_List.add(new Medicene_Branded("Paxil", "MediSolutions", "Antidepressant", 82734691, "2023-08-15", "Tokyo", 20, 12));
        Medicene_Branded_List.add(new Medicene_Branded("Lasix", "PharmaCure", "Diuretic", 29834719, "2023-07-19", "Seoul", 30, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Crestor", "MediLife", "Statin", 81927346, "2023-09-07", "Bangalore", 60, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Depakote", "HealthCare Inc.", "Anticonvulsant", 18374926, "2023-08-25", "Chennai", 30, 500));
        Medicene_Branded_List.add(new Medicene_Branded("Seroquel", "HealthWell", "Antipsychotic", 82917436, "2023-07-16", "Mumbai", 20, 100));
        Medicene_Branded_List.add(new Medicene_Branded("Coumadin", "PharmaPro", "Anticoagulant", 81924736, "2023-09-30", "Delhi", 15, 2));
        Medicene_Branded_List.add(new Medicene_Branded("Cipro", "MediGen", "Fluoroquinolone", 29184637, "2023-08-22", "Singapore", 20, 750));
        Medicene_Branded_List.add(new Medicene_Branded("Levitra", "GlobalHealth", "Erectile Dysfunction", 82736491, "2023-07-05", "Hong Kong", 30, 20));
        Medicene_Branded_List.add(new Medicene_Branded("Avandia", "PharmaNext", "Antidiabetic", 91827463, "2023-09-18", "Shanghai", 40, 30));
        Medicene_Branded_List.add(new Medicene_Branded("Risperdal", "MediWell", "Antipsychotic", 82736194, "2023-08-11", "Beijing", 50, 50));
        Medicene_Branded_List.add(new Medicene_Branded("Protonix", "HealthMed", "Proton Pump Inhibitor", 92847316, "2023-07-25", "Tokyo", 60, 20));
        Medicene_Branded_List.add(new Medicene_Branded("Effexor", "PharmaLife", "Antidepressant", 81928346, "2023-09-08", "Seoul", 30, 80));
        Medicene_Branded_List.add(new Medicene_Branded("Vioxx", "GlobalHealth", "NSAID", 98374612, "2023-08-23", "Bangalore", 20, 100));
        Medicene_Branded_List.add(new Medicene_Branded("Celebrex", "MediSolutions", "NSAID", 82376914, "2023-07-27", "Chennai", 10, 120));
        Medicene_Branded_List.add(new Medicene_Branded("Zetia", "HealthWell", "Cholesterol-lowering", 81974362, "2023-09-14", "Mumbai", 20, 50));
        Medicene_Branded_List.add(new Medicene_Branded("Vicodin", "PharmaPro", "Painkiller", 82736492, "2023-08-09", "Delhi", 25, 10));
        Medicene_Branded_List.add(new Medicene_Branded("Lipitor", "MediLife", "Statin", 82749163, "2023-07-23", "Singapore", 30, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Nexium", "HealthFirst", "Proton Pump Inhibitor", 81946237, "2023-09-17", "Hong Kong", 45, 20));
        Medicene_Branded_List.add(new Medicene_Branded("Symbicort", "PharmaDose", "Bronchodilator", 91873642, "2023-08-03", "Shanghai", 60, 120));
        Medicene_Branded_List.add(new Medicene_Branded("OxyContin", "MediWell", "Opioid", 82734169, "2023-07-19", "Beijing", 30, 80));
        Medicene_Branded_List.add(new Medicene_Branded("Nasonex", "GlobalHealth", "Corticosteroid", 83746192, "2023-09-12", "Tokyo", 20, 5));
        Medicene_Branded_List.add(new Medicene_Branded("Xanax", "PharmaNext", "Benzodiazepine", 81936417, "2023-08-02", "Seoul", 10, 0.5));
        Medicene_Branded_List.add(new Medicene_Branded("Prevacid", "MediCure", "Proton Pump Inhibitor", 19283647, "2023-07-25", "Bangalore", 20, 15));
        Medicene_Branded_List.add(new Medicene_Branded("Prozac", "HealthWell", "Antidepressant", 82734619, "2023-09-14", "Chennai", 30, 30));
        Medicene_Branded_List.add(new Medicene_Branded("Wellbutrin", "PharmaNext", "Antidepressant", 82739146, "2023-08-05", "Mumbai", 20, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Zofran", "Alpha Meds", "Antiemetic", 91832746, "2023-07-28", "Delhi", 30, 8));
        Medicene_Branded_List.add(new Medicene_Branded("Paxil", "MediSolutions", "Antidepressant", 81926347, "2023-09-03", "Singapore", 20, 12));
        Medicene_Branded_List.add(new Medicene_Branded("Lasix", "PharmaCure", "Diuretic", 72938164, "2023-08-20", "Hong Kong", 30, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Crestor", "MediLife", "Statin", 19283746, "2023-07-09", "Shanghai", 60, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Depakote", "HealthCare Inc.", "Anticonvulsant", 82376419, "2023-09-24", "Beijing", 30, 500));
        Medicene_Branded_List.add(new Medicene_Branded("Seroquel", "HealthWell", "Antipsychotic", 83746192, "2023-08-11", "Tokyo", 20, 100));
        Medicene_Branded_List.add(new Medicene_Branded("Coumadin", "PharmaPro", "Anticoagulant", 81927364, "2023-07-30", "Seoul", 15, 2));
        Medicene_Branded_List.add(new Medicene_Branded("Cipro", "MediGen", "Fluoroquinolone", 19283746, "2023-08-22", "Bangalore", 20, 750));
        Medicene_Branded_List.add(new Medicene_Branded("Levitra", "GlobalHealth", "Erectile Dysfunction", 82736491, "2023-07-05", "Chennai", 30, 20));
        Medicene_Branded_List.add(new Medicene_Branded("Avandia", "PharmaNext", "Antidiabetic", 21983746, "2023-09-20", "Mumbai", 40, 30));
        Medicene_Branded_List.add(new Medicene_Branded("Risperdal", "MediWell", "Antipsychotic", 81928764, "2023-08-11", "Delhi", 50, 50));
        Medicene_Branded_List.add(new Medicene_Branded("Protonix", "HealthMed", "Proton Pump Inhibitor", 19283647, "2023-07-25", "Singapore", 60, 20));
        Medicene_Branded_List.add(new Medicene_Branded("Effexor", "PharmaLife", "Antidepressant", 82736491, "2023-09-08", "Hong Kong", 30, 80));
        Medicene_Branded_List.add(new Medicene_Branded("Vioxx", "GlobalHealth", "NSAID", 83746192, "2023-08-13", "Shanghai", 20, 100));
        Medicene_Branded_List.add(new Medicene_Branded("Celebrex", "MediSolutions", "NSAID", 98376412, "2023-07-26", "Beijing", 10, 120));
        Medicene_Branded_List.add(new Medicene_Branded("Zetia", "HealthWell", "Cholesterol-lowering", 81937642, "2023-09-14", "Tokyo", 20, 50));
        Medicene_Branded_List.add(new Medicene_Branded("Vicodin", "PharmaPro", "Painkiller", 82374169, "2023-08-09", "Seoul", 25, 10));
        Medicene_Branded_List.add(new Medicene_Branded("Lipitor", "MediLife", "Statin", 82746139, "2023-07-23", "Bangalore", 30, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Nexium", "HealthFirst", "Proton Pump Inhibitor", 81937462, "2023-09-17", "Chennai", 45, 20));
        Medicene_Branded_List.add(new Medicene_Branded("Symbicort", "PharmaDose", "Bronchodilator", 91873461, "2023-08-03", "Mumbai", 60, 120));
        Medicene_Branded_List.add(new Medicene_Branded("OxyContin", "MediWell", "Opioid", 82734691, "2023-07-19", "Delhi", 30, 80));
        Medicene_Branded_List.add(new Medicene_Branded("Nasonex", "GlobalHealth", "Corticosteroid", 83746129, "2023-08-18","Lukhnow",45,25));
        Medicene_Branded_List.add(new Medicene_Branded("Nasonex", "GlobalHealth", "Corticosteroid", 83746129, "2023-09-12", "Tokyo", 20, 5));
        Medicene_Branded_List.add(new Medicene_Branded("Xanax", "PharmaNext", "Benzodiazepine", 81937641, "2023-08-02", "Seoul", 10, 0.5));
        Medicene_Branded_List.add(new Medicene_Branded("Prevacid", "MediCure", "Proton Pump Inhibitor", 19283467, "2023-07-25", "Bangalore", 20, 15));
        Medicene_Branded_List.add(new Medicene_Branded("Prozac", "HealthWell", "Antidepressant", 82734619, "2023-09-14", "Chennai", 30, 30));
        Medicene_Branded_List.add(new Medicene_Branded("Wellbutrin", "PharmaNext", "Antidepressant", 82736419, "2023-08-05", "Mumbai", 20, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Zofran", "Alpha Meds", "Antiemetic", 91832746, "2023-07-28", "Delhi", 30, 8));
        Medicene_Branded_List.add(new Medicene_Branded("Paxil", "MediSolutions", "Antidepressant", 81926347, "2023-09-03", "Singapore", 20, 12));
        Medicene_Branded_List.add(new Medicene_Branded("Lasix", "PharmaCure", "Diuretic", 72938164, "2023-08-20", "Hong Kong", 30, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Crestor", "MediLife", "Statin", 19283746, "2023-07-09", "Shanghai", 60, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Depakote", "HealthCare Inc.", "Anticonvulsant", 82376419, "2023-09-24", "Beijing", 30, 500));
        Medicene_Branded_List.add(new Medicene_Branded("Seroquel", "HealthWell", "Antipsychotic", 83746192, "2023-08-11", "Tokyo", 20, 100));
        Medicene_Branded_List.add(new Medicene_Branded("Coumadin", "PharmaPro", "Anticoagulant", 81927364, "2023-07-30", "Seoul", 15, 2));
        Medicene_Branded_List.add(new Medicene_Branded("Cipro", "MediGen", "Fluoroquinolone", 19283746, "2023-08-22", "Bangalore", 20, 750));
        Medicene_Branded_List.add(new Medicene_Branded("Levitra", "GlobalHealth", "Erectile Dysfunction", 82736491, "2023-07-05", "Chennai", 30, 20));
        Medicene_Branded_List.add(new Medicene_Branded("Avandia", "PharmaNext", "Antidiabetic", 21983746, "2023-09-20", "Mumbai", 40, 30));
        Medicene_Branded_List.add(new Medicene_Branded("Risperdal", "MediWell", "Antipsychotic", 81928764, "2023-08-11", "Delhi", 50, 50));
        Medicene_Branded_List.add(new Medicene_Branded("Protonix", "HealthMed", "Proton Pump Inhibitor", 19283647, "2023-07-25", "Singapore", 60, 20));
        Medicene_Branded_List.add(new Medicene_Branded("Effexor", "PharmaLife", "Antidepressant", 82736491, "2023-09-08", "Hong Kong", 30, 80));
        Medicene_Branded_List.add(new Medicene_Branded("Vioxx", "GlobalHealth", "NSAID", 83746192, "2023-08-13", "Shanghai", 20, 100));
        Medicene_Branded_List.add(new Medicene_Branded("Celebrex", "MediSolutions", "NSAID", 98376412, "2023-07-26", "Beijing", 10, 120));
        Medicene_Branded_List.add(new Medicene_Branded("Zetia", "HealthWell", "Cholesterol-lowering", 81937642, "2023-09-14", "Tokyo", 20, 50));
        Medicene_Branded_List.add(new Medicene_Branded("Vicodin", "PharmaPro", "Painkiller", 82374169, "2023-08-09", "Seoul", 25, 10));
        Medicene_Branded_List.add(new Medicene_Branded("Lipitor", "MediLife", "Statin", 82746139, "2023-07-23", "Bangalore", 30, 40));
        Medicene_Branded_List.add(new Medicene_Branded("Nexium", "HealthFirst", "Proton Pump Inhibitor", 81937462, "2023-09-17", "Chennai", 45, 20));

//        -------------------------------- Medicine Generic Data ------------------------------------------------------

        List<Medicine_Generic> Medicine_Generic_List = new ArrayList<>();

        Medicine_Generic_List.add(new Medicine_Generic("Dolo", "Neo-Pharma", "Pain-Killer", 15422417, "01-01-24", "Thane", 20, 500));
        Medicine_Generic_List.add(new Medicine_Generic("Cetirizine", "XYZ Labs", "Antihistamine", 2837265, "02-01-24", "Mumbai", 50, 200));
        Medicine_Generic_List.add(new Medicine_Generic("Paracetamol", "ABC Pharmaceuticals", "Fever Reducer", 9172634, "03-01-24", "Delhi", 30, 150));
        Medicine_Generic_List.add(new Medicine_Generic("Aspirin", "MediCorp", "Pain Reliever", 36274982, "04-01-24", "Bangalore", 25, 300));
        Medicine_Generic_List.add(new Medicine_Generic("Ranitidine", "PharmaHealth", "Acid Reducer", 18273645, "05-01-24", "Chennai", 40, 250));
        Medicine_Generic_List.add(new Medicine_Generic("Ibuprofen", "CareLabs", "Anti-Inflammatory", 15273648, "06-01-24", "Kolkata", 35, 350));
        Medicine_Generic_List.add(new Medicine_Generic("Omeprazole", "RxPharma", "Heartburn Medication", 98735427, "07-01-24", "Pune", 45, 400));
        Medicine_Generic_List.add(new Medicine_Generic("Amoxicillin", "PharmaCare", "Antibiotic", 28374659, "08-01-24", "Hyderabad", 60, 450));
        Medicine_Generic_List.add(new Medicine_Generic("Atorvastatin", "HealthMed", "Cholesterol Lowering", 82736491, "09-01-24", "Lucknow", 55, 550));
        Medicine_Generic_List.add(new Medicine_Generic("Metformin", "PharmaWell", "Diabetes Management", 73649581, "10-01-24", "Ahmedabad", 75, 600));
        Medicine_Generic_List.add(new Medicine_Generic("Loratadine", "SmartMeds", "Allergy Relief", 16387294, "11-01-24", "Jaipur", 48, 350));
        Medicine_Generic_List.add(new Medicine_Generic("Ciprofloxacin", "PharmaCure", "Antibacterial", 29385472, "12-01-24", "Indore", 70, 500));
        Medicine_Generic_List.add(new Medicine_Generic("Tramadol", "ReliefMeds", "Pain Management", 84723659, "13-01-24", "Coimbatore", 62, 700));
        Medicine_Generic_List.add(new Medicine_Generic("Losartan", "PharmaGuard", "Blood Pressure Control", 29378462, "14-01-24", "Surat", 55, 550));
        Medicine_Generic_List.add(new Medicine_Generic("Pregabalin", "NeuroMeds", "Nerve Pain Relief", 97234681, "15-01-24", "Bhopal", 40, 450));
        Medicine_Generic_List.add(new Medicine_Generic("Azithromycin", "PharmaXpress", "Antibiotic", 28473961, "16-01-24", "Nagpur", 65, 600));
        Medicine_Generic_List.add(new Medicine_Generic("Montelukast", "BreatheWell", "Asthma Controller", 73649572, "17-01-24", "Surat", 50, 300));
        Medicine_Generic_List.add(new Medicine_Generic("Esomeprazole", "Nexcare", "Acid Reducer", 19485726, "18-01-24", "Mysore", 42, 400));
        Medicine_Generic_List.add(new Medicine_Generic("Fluoxetine", "MoodMeds", "Antidepressant", 84726351, "19-01-24", "Chandigarh", 32, 250));
        Medicine_Generic_List.add(new Medicine_Generic("Venlafaxine", "PharmaMind", "Antidepressant", 29183746, "20-01-24", "Kanpur", 38, 350));
        Medicine_Generic_List.add(new Medicine_Generic("Furosemide", "Diurex", "Diuretic", 67482954, "21-01-24", "Gurgaon", 48, 450));
        Medicine_Generic_List.add(new Medicine_Generic("Hydrochlorothiazide", "WaterAway", "Water Pill", 98274635, "22-01-24", "Noida", 33, 400));
        Medicine_Generic_List.add(new Medicine_Generic("Metoprolol", "HeartShield", "Beta Blocker", 18273645, "23-01-24", "Faridabad", 55, 500));
        Medicine_Generic_List.add(new Medicine_Generic("Simvastatin", "LipidGuard", "Cholesterol Lowering", 82957364, "24-01-24", "Lucknow", 42, 350));
        Medicine_Generic_List.add(new Medicine_Generic("Propranolol", "AnxioMeds", "Beta Blocker", 29374658, "25-01-24", "Bengaluru", 50, 400));
        Medicine_Generic_List.add(new Medicine_Generic("Lisinopril", "PressureGuard", "Blood Pressure Control", 18274639, "26-01-24", "Kolkata", 45, 450));
        Medicine_Generic_List.add(new Medicine_Generic("Carvedilol", "CardioMeds", "Beta Blocker", 49273658, "27-01-24", "Pune", 52, 500));
        Medicine_Generic_List.add(new Medicine_Generic("Warfarin", "ClotShield", "Blood Thinner", 29384761, "28-01-24", "Navi Mumbai", 28, 300));
        Medicine_Generic_List.add(new Medicine_Generic("Amlodipine", "HeartMeds", "Calcium Channel Blocker", 18375629, "29-01-24", "Thane", 38, 400));
        Medicine_Generic_List.add(new Medicine_Generic("Metronidazole", "InfectiMeds", "Antibacterial", 58273641, "30-01-24", "Nashik", 60, 550));
        Medicine_Generic_List.add(new Medicine_Generic("Diazepam", "RelaxMeds", "Antianxiety", 16372845, "31-01-24", "Ahmedabad", 45, 350));
        Medicine_Generic_List.add(new Medicine_Generic("Paracetamol", "FeverRelief", "Antipyretic", 12345678, "23-08-23", "Mumbai", 100, 50));
        Medicine_Generic_List.add(new Medicine_Generic("Ibuprofen", "PainRelief", "NSAID", 87654321, "15-12-23", "Delhi", 75, 200));
        Medicine_Generic_List.add(new Medicine_Generic("Aspirin", "PainRelief", "Analgesic", 19283746, "30-06-24", "Kolkata", 90, 100));
        Medicine_Generic_List.add(new Medicine_Generic("Loratadine", "AllergyRelief", "Antihistamine", 13579246, "07-11-23", "Chennai", 60, 250));
        Medicine_Generic_List.add(new Medicine_Generic("Cetirizine", "AllergyRelief", "Antihistamine", 24681357, "19-05-24", "Bangalore", 30, 150));
        Medicine_Generic_List.add(new Medicine_Generic("Amoxicillin", "Antibiotic", "Penicillin", 65748392, "28-09-23", "Hyderabad", 120, 300));
        Medicine_Generic_List.add(new Medicine_Generic("Ciprofloxacin", "Antibiotic", "Fluoroquinolone", 38475620, "14-03-24", "Ahmedabad", 80, 400));
        Medicine_Generic_List.add(new Medicine_Generic("Omeprazole", "AcidRelief", "Proton Pump Inhibitor", 95175386, "25-07-23", "Pune", 50, 1000));
        Medicine_Generic_List.add(new Medicine_Generic("Ranitidine", "AcidRelief", "H2 Receptor Antagonist", 52637489, "10-02-24", "Jaipur", 70, 800));
        Medicine_Generic_List.add(new Medicine_Generic("Simvastatin", "CholesterolControl", "Statin", 98765432, "31-08-23", "Lucknow", 100, 600));
        Medicine_Generic_List.add(new Medicine_Generic("Losartan", "BloodPressureControl", "ARB", 12348765, "17-01-24", "Indore", 65, 750));
        Medicine_Generic_List.add(new Medicine_Generic("Metformin", "DiabetesControl", "Biguanide", 56781234, "12-06-23", "Surat", 90, 300));
        Medicine_Generic_List.add(new Medicine_Generic("Insulin", "DiabetesControl", "Hormone", 87651234, "28-11-23", "Kanpur", 30, 1000));
        Medicine_Generic_List.add(new Medicine_Generic("Atorvastatin", "CholesterolControl", "Statin", 12546837, "05-04-24", "Nagpur", 80, 700));
        Medicine_Generic_List.add(new Medicine_Generic("Metoprolol", "BloodPressureControl", "Beta-Blocker", 98763214, "20-09-23", "Patna", 50, 500));
        Medicine_Generic_List.add(new Medicine_Generic("Fluoxetine", "Antidepressant", "SSRI", 35486912, "13-02-24", "Bhopal", 40, 350));
        Medicine_Generic_List.add(new Medicine_Generic("Sertraline", "Antidepressant", "SSRI", 84692037, "27-07-23", "Coimbatore", 60, 450));
        Medicine_Generic_List.add(new Medicine_Generic("Alprazolam", "Antianxiety", "Benzodiazepine", 19283746, "03-12-24", "Vadodara", 25, 200));
        Medicine_Generic_List.add(new Medicine_Generic("Lisinopril", "BloodPressureControl", "ACE Inhibitor", 58294736, "18-05-23", "Ludhiana", 40, 550));
        Medicine_Generic_List.add(new Medicine_Generic("Levothyroxine", "ThyroidControl", "Hormone", 27384950, "04-10-24", "Agra", 75, 600));
        Medicine_Generic_List.add(new Medicine_Generic("Azithromycin", "Antibiotic", "Macrolide", 12345678, "9-03-23", "Varanasi", 100, 400));
        Medicine_Generic_List.add(new Medicine_Generic("Cephalexin", "Antibiotic", "Cephalosporin", 87654321, "03-08-24", "Srinagar", 80, 300));
        Medicine_Generic_List.add(new Medicine_Generic("Tetracycline", "Antibiotic", "Tetracycline", 19283746, "17-01-23", "Ranchi", 60, 200));
        Medicine_Generic_List.add(new Medicine_Generic("Doxycycline", "Antibiotic", "Tetracycline", 13579246, "31-05-24", "Guwahati", 90, 250));
        Medicine_Generic_List.add(new Medicine_Generic("Fluconazole", "Antifungal", "Azole", 24681357, "14-10-23", "Amritsar", 30, 150));
        Medicine_Generic_List.add(new Medicine_Generic("Clotrimazole", "Antifungal", "Imidazole", 65748392, "28-03-24", "Kochi", 120, 100));
        Medicine_Generic_List.add(new Medicine_Generic("Albendazole", "Antiparasitic", "Benzimidazole", 38475620, "11-08-23", "Coimbatore", 80, 300));
        Medicine_Generic_List.add(new Medicine_Generic("Mebendazole", "Antiparasitic", "Benzimidazole", 95175386, "5-01-24", "Visakhapatnam", 50, 250));
        Medicine_Generic_List.add(new Medicine_Generic("Esomeprazole", "AcidRelief", "Proton Pump Inhibitor", 52637489, "08-06-23", "Varanasi", 70, 800));
        Medicine_Generic_List.add(new Medicine_Generic("Metoprolol", "Heart Medication", "Beta Blocker", 87451236, "2023-08-11", "Austin", 60, 400));
        Medicine_Generic_List.add(new Medicine_Generic("Clopidogrel", "Blood Thinner", "Antiplatelet", 62345178, "2023-08-12", "Jacksonville", 30, 300));
        Medicine_Generic_List.add(new Medicine_Generic("Furosemide", "Diuretic", "Water Pill", 38517456, "2023-08-13", "San Francisco", 90, 550));
        Medicine_Generic_List.add(new Medicine_Generic("Montelukast", "Asthma Control", "Leukotriene Inhibitor", 85147896, "2023-08-14", "Columbus", 45, 350));
        Medicine_Generic_List.add(new Medicine_Generic("Amlodipine", "Blood Pressure Control", "Calcium Channel Blocker", 96325487, "2023-08-15", "Fort Worth", 120, 750));
        Medicine_Generic_List.add(new Medicine_Generic("Cephalexin", "Antibiotic", "Cephalosporin", 74185296, "2023-08-16", "Charlotte", 60, 450));
        Medicine_Generic_List.add(new Medicine_Generic("Azithromycin", "Antibiotic", "Macrolide", 52148763, "2023-08-17", "Detroit", 30, 250));
        Medicine_Generic_List.add(new Medicine_Generic("Prednisone", "Anti-inflammatory", "Corticosteroid", 78569321, "2023-08-18", "El Paso", 90, 600));
        Medicine_Generic_List.add(new Medicine_Generic("Esomeprazole", "Acid Reflux Relief", "Proton Pump Inhibitor", 96587423, "2023-08-19", "Seattle", 60, 550));
        Medicine_Generic_List.add(new Medicine_Generic("Metronidazole", "Antibiotic", "Antiprotozoal", 96321475, "2023-08-20", "Denver", 45, 350));
        Medicine_Generic_List.add(new Medicine_Generic("Tramadol", "Pain Relief", "Opioid Analgesic", 45632187, "2023-08-21", "Washington, D.C.", 30, 400));
        Medicine_Generic_List.add(new Medicine_Generic("Ciprofloxacin", "Antibiotic", "Fluoroquinolone", 74589631, "2023-08-22", "Boston", 90, 600));
        Medicine_Generic_List.add(new Medicine_Generic("Doxycycline", "Antibiotic", "Tetracycline", 85296314, "2023-08-23", "Nashville", 120, 750));
        Medicine_Generic_List.add(new Medicine_Generic("Albuterol", "Bronchodilator", "Beta-2 Agonist", 96587432, "2023-08-24", "Las Vegas", 60, 450));
        Medicine_Generic_List.add(new Medicine_Generic("Fluoxetine", "Antidepressant", "SSRI", 78596324, "2023-08-25", "Oklahoma City", 45, 350));
        Medicine_Generic_List.add(new Medicine_Generic("Atorvastatin", "Cholesterol Control", "Statins", 52369741, "2023-08-26", "Portland", 30, 300));
        Medicine_Generic_List.add(new Medicine_Generic("Bupropion", "Antidepressant", "Norepinephrine-Dopamine Reuptake Inhibitor", 96587436, "2023-08-27", "Las Vegas", 90, 600));
        Medicine_Generic_List.add(new Medicine_Generic("Amoxicillin", "Antibiotic", "Penicillin", 78541236, "2023-08-28", "San Francisco", 60, 450));
        Medicine_Generic_List.add(new Medicine_Generic("Losartan", "Blood Pressure Control", "Angiotensin II Receptor Blocker", 62378415, "2023-08-29", "Seattle", 120, 750));
        Medicine_Generic_List.add(new Medicine_Generic("Citalopram", "Antidepressant", "SSRI", 96587439, "2023-08-30", "Detroit", 45, 350));
        Medicine_Generic_List.add(new Medicine_Generic("Metformin", "Diabetes Management", "Antidiabetic", 62341238, "2023-08-31", "Dallas", 30, 300));
        Medicine_Generic_List.add(new Medicine_Generic("Hydrochlorothiazide", "Diuretic", "Thiazide", 78549321, "2023-09-01", "Charlotte", 90, 600));
        Medicine_Generic_List.add(new Medicine_Generic("Celecoxib", "Pain Relief", "NSAID", 52187439, "2023-09-02", "Fort Worth", 60, 450));
        Medicine_Generic_List.add(new Medicine_Generic("Metoprolol", "Heart Medication", "Beta Blocker", 96587435, "2023-09-03", "Chicago", 45, 350));
        Medicine_Generic_List.add(new Medicine_Generic("Clarithromycin", "Antibiotic", "Macrolide", 52174963, "2023-09-04", "Austin", 30, 300));
        Medicine_Generic_List.add(new Medicine_Generic("Pantoprazole", "Acid Reflux Relief", "Proton Pump Inhibitor", 78541239, "2023-09-05", "Phoenix", 90, 600));
        Medicine_Generic_List.add(new Medicine_Generic("Prednisolone", "Anti-inflammatory", "Corticosteroid", 62314789, "2023-09-06", "San Antonio", 60, 450));
        Medicine_Generic_List.add(new Medicine_Generic("Levothyroxine", "Thyroid Hormone Replacement", "Synthetic Thyroid Hormone", 96548721, "2023-09-07", "San Diego", 45, 350));
        Medicine_Generic_List.add(new Medicine_Generic("Panadol", "Pain Relief", "Analgesic", 73645289, "2023-08-15", "New York", 30, 250));
        Medicine_Generic_List.add(new Medicine_Generic("Ibuprofen", "Pain Relief", "NSAID", 98263415, "2023-09-01", "London", 60, 400));
        Medicine_Generic_List.add(new Medicine_Generic("Loratadine", "Allergy Relief", "Antihistamine", 58271934, "2023-07-25", "Berlin", 20, 10));
        Medicine_Generic_List.add(new Medicine_Generic("Omeprazole", "Heartburn Relief", "Proton Pump Inhibitor", 72198346, "2023-08-30", "Paris", 90, 20));
        Medicine_Generic_List.add(new Medicine_Generic("Metformin", "Diabetes Control", "Antidiabetic", 23984712, "2023-06-10", "Tokyo", 120, 500));
        Medicine_Generic_List.add(new Medicine_Generic("Atorvastatin", "Cholesterol Management", "Statin", 73249856, "2023-09-12", "Sydney", 60, 40));
        Medicine_Generic_List.add(new Medicine_Generic("Azithromycin", "Antibiotic", "Macrolide", 81927345, "2023-07-18", "Toronto", 10, 250));
        Medicine_Generic_List.add(new Medicine_Generic("Cetirizine", "Allergy Relief", "Antihistamine", 23456789, "2023-06-05", "Mumbai", 40, 5));
        Medicine_Generic_List.add(new Medicine_Generic("Losartan", "Hypertension Control", "Angiotensin Receptor Blocker", 73649821, "2023-08-22", "Delhi", 30, 50));
        Medicine_Generic_List.add(new Medicine_Generic("Sertraline", "Antidepressant", "SSRI", 98236571, "2023-09-30", "Bangalore", 90, 100));
        Medicine_Generic_List.add(new Medicine_Generic("Alprazolam", "Anxiety Relief", "Benzodiazepine", 61928374, "2023-07-07", "Chennai", 50, 0.5));
        Medicine_Generic_List.add(new Medicine_Generic("Fluoxetine", "Antidepressant", "SSRI", 89456123, "2023-08-18", "Singapore", 45, 20));
        Medicine_Generic_List.add(new Medicine_Generic("Cefuroxime", "Antibiotic", "Cephalosporin", 56123874, "2023-06-29", "Hong Kong", 20, 500));
        Medicine_Generic_List.add(new Medicine_Generic("Levofloxacin", "Antibiotic", "Fluoroquinolone", 62384792, "2023-09-05", "Seoul", 30, 750));
        Medicine_Generic_List.add(new Medicine_Generic("Doxycycline", "Antibiotic", "Tetracycline", 19283746, "2023-07-12", "Beijing", 60, 100));
        Medicine_Generic_List.add(new Medicine_Generic("Ciprofloxacin", "Antibiotic", "Fluoroquinolone", 92384756, "2023-08-28", "Shanghai", 20, 750));
        Medicine_Generic_List.add(new Medicine_Generic("Montelukast", "Asthma Control", "Leukotriene Modifier", 81927346, "2023-06-19", "Dubai", 30, 10));
        Medicine_Generic_List.add(new Medicine_Generic("Amlodipine", "Hypertension Control", "Calcium Channel Blocker", 67182934, "2023-08-03", "Moscow", 90, 5));
        Medicine_Generic_List.add(new Medicine_Generic("Metoprolol", "Hypertension Control", "Beta-blocker", 27348912, "2023-07-21", "Istanbul", 60, 50));
        Medicine_Generic_List.add(new Medicine_Generic("Paroxetine", "Antidepressant", "SSRI", 79812456, "23-09-27", "Rome", 30, 30));
        Medicine_Generic_List.add(new Medicine_Generic("Rabeprazole", "Heartburn Relief", "Proton Pump Inhibitor", 23875641, "2023-08-07", "Athens", 45, 20));
        Medicine_Generic_List.add(new Medicine_Generic("Simvastatin", "Cholesterol Management", "Statin", 73198234, "2023-06-24", "Cairo", 120, 40));
        Medicine_Generic_List.add(new Medicine_Generic("Diazepam", "Anxiety Relief", "Benzodiazepine", 98237465, "2023-08-11", "Johannesburg", 10, 2));
        Medicine_Generic_List.add(new Medicine_Generic("Prednisone", "Anti-inflammatory", "Corticosteroid", 87345612, "2023-09-28", "Sao Paulo", 20, 5));
        Medicine_Generic_List.add(new Medicine_Generic("Metronidazole", "Antibiotic", "Nitroimidazole", 18273945, "2023-07-02", "Mexico City", 30, 250));

//        ----------------------------------------------------Admit patient data ------------------------------------------------------------------------------

        List<Admit>Admit_List = new ArrayList<>();

        Admit_List.add(new Admit("Mayur","Prabhakar","Devadiga",21,"Male","Cosmos Road,W","8475485454","Friend"));
        Admit_List.add(new Admit("John", "Doe", "Smith", 30, "Male", "123 Main St", "123-456-7890", "Friend"));
        Admit_List.add(new Admit("Jane", "Smith", "Doe", 25, "Female", "456 Elm St", "987-654-3210", "Family"));
        Admit_List.add(new Admit("Michael", "Johnson", "Williams", 40, "Male", "789 Oak St", "456-123-7890", "Friend"));
        Admit_List.add(new Admit("Emily", "Williams", "Johnson", 35, "Female", "321 Birch St", "789-123-4560", "Family"));
        Admit_List.add(new Admit("David", "Brown", "Davis", 28, "Male", "654 Pine St", "987-321-4560", "Friend"));
        Admit_List.add(new Admit("Sophia", "Lee", "Brown", 32, "Female", "987 Maple St", "789-456-1230", "Family"));
        Admit_List.add(new Admit("Oliver", "Davis", "Lee", 29, "Male", "654 Elm St", "123-789-4560", "Friend"));
        Admit_List.add(new Admit("Isabella", "Wilson", "Davis", 33, "Female", "789 Oak St", "987-456-1230", "Family"));
        Admit_List.add(new Admit("James", "Johnson", "Wilson", 24, "Male", "456 Pine St", "789-123-4560", "Friend"));
        Admit_List.add(new Admit("Ava", "Martin", "Johnson", 26, "Female", "789 Maple St", "987-321-4560", "Family"));
        Admit_List.add(new Admit("William", "Thompson", "Martin", 31, "Male", "789 Elm St", "123-789-4560", "Friend"));
        Admit_List.add(new Admit("Emma", "Anderson", "Thompson", 29, "Female", "456 Oak St", "789-456-1230", "Family"));
        Admit_List.add(new Admit("Liam", "Garcia", "Anderson", 27, "Male", "654 Maple St", "987-123-4560", "Friend"));
        Admit_List.add(new Admit("Mia", "Martinez", "Garcia", 30, "Female", "987 Elm St", "789-789-4560", "Family"));
        Admit_List.add(new Admit("Noah", "Hernandez", "Martinez", 22, "Male", "321 Pine St", "123-456-1230", "Friend"));
        Admit_List.add(new Admit("Olivia", "Robinson", "Hernandez", 24, "Female", "987 Oak St", "789-123-7890", "Family"));
        Admit_List.add(new Admit("Ethan", "Lewis", "Robinson", 32, "Male", "456 Elm St", "123-789-1230", "Friend"));
        Admit_List.add(new Admit("Aiden", "Allen", "Lewis", 28, "Male", "654 Maple St", "789-456-7890", "Family"));
        Admit_List.add(new Admit("Amelia", "Scott", "Allen", 29, "Female", "789 Oak St", "987-123-7890", "Friend"));
        Admit_List.add(new Admit("Benjamin", "Green", "Scott", 25, "Male", "321 Elm St", "456-789-1230", "Family"));
        Admit_List.add(new Admit("Harper", "King", "Green", 27, "Female", "789 Pine St", "789-123-4560", "Friend"));
        Admit_List.add(new Admit("Lucas", "Baker", "King", 33, "Male", "654 Oak St", "123-456-7890", "Family"));
        Admit_List.add(new Admit("Evelyn", "Ward", "Baker", 30, "Female", "987 Maple St", "789-789-1230", "Friend"));
        Admit_List.add(new Admit("Zoey", "Cox", "Ward", 26, "Female", "456 Elm St", "123-789-4560", "Family"));
        Admit_List.add(new Admit("Alexander", "Murphy", "Cox", 24, "Male", "789 Pine St", "789-456-7890", "Friend"));
        Admit_List.add(new Admit("Victoria", "Richardson", "Murphy", 31, "Female", "321 Maple St", "123-123-7890", "Family"));
        Admit_List.add(new Admit("Luke", "Rivera", "Richardson", 23, "Male", "789 Elm St", "456-789-1230", "Friend"));
        Admit_List.add(new Admit("Madison", "Ross", "Rivera", 30, "Female", "456 Oak St", "789-123-4560", "Family"));
        Admit_List.add(new Admit("Henry", "Coleman", "Ross", 25, "Male", "654 Pine St", "123-456-7890", "Friend"));
        Admit_List.add(new Admit("Grace", "Morgan", "Coleman", 29, "Female", "987 Elm St", "789-789-1230", "Family"));
        Admit_List.add(new Admit("Leo", "Peterson", "Morgan", 26, "Male", "321 Maple St", "123-789-4560", "Friend"));
        Admit_List.add(new Admit("Chloe", "Reed", "Peterson", 32, "Female", "789 Oak St", "789-456-7890", "Family"));
        Admit_List.add(new Admit("Gabriel", "Wood", "Reed", 28, "Male", "654 Elm St", "123-123-7890", "Friend"));
        Admit_List.add(new Admit("Addison", "Stewart", "Wood", 27, "Female", "987 Pine St", "456-789-1230", "Family"));
        Admit_List.add(new Admit("Bentley", "Cox", "Stewart", 30, "Male", "456 Oak St", "789-123-4560", "Friend"));
        Admit_List.add(new Admit("Paisley", "Bailey", "Cox", 24, "Female", "789 Elm St", "123-456-7890", "Family"));
        Admit_List.add(new Admit("Jonathan", "Hill", "Bailey", 22, "Male", "654 Maple St", "789-789-1230", "Friend"));
        Admit_List.add(new Admit("Nora", "Simmons", "Hill", 25, "Female", "321 Elm St", "123-123-7890", "Family"));
        Admit_List.add(new Admit("Carter", "Rogers", "Simmons", 32, "Male", "987 Pine St", "789-456-7890", "Friend"));
        Admit_List.add(new Admit("Sadie", "Price", "Rogers", 30, "Female", "789 Oak St", "456-789-1230", "Family"));
        Admit_List.add(new Admit("Owen", "Wood", "Price", 28, "Male", "654 Elm St", "789-123-4560", "Friend"));
        Admit_List.add(new Admit("Aria", "Foster", "Wood", 33, "Female", "456 Maple St", "123-789-7890", "Family"));
        Admit_List.add(new Admit("Wyatt", "Bryant", "Foster", 29, "Male", "789 Oak St", "789-123-1230", "Friend"));
        Admit_List.add(new Admit("Hazel", "Howard", "Bryant", 25, "Female", "321 Elm St", "123-456-7890", "Family"));
        Admit_List.add(new Admit("Eli", "Butler", "Howard", 31, "Male", "789 Maple St", "456-789-1230", "Friend"));
        Admit_List.add(new Admit("Scarlett", "Jenkins", "Butler", 26, "Female", "456 Pine St", "789-123-7890", "Family"));
        Admit_List.add(new Admit("Maverick", "Hamilton", "Jenkins", 27, "Male", "654 Oak St", "123-789-1230", "Friend"));
        Admit_List.add(new Admit("Lily", "Foster", "Hamilton", 30, "Female", "789 Elm St", "789-456-7890", "Family"));
        Admit_List.add(new Admit("Grayson", "Long", "Foster", 28, "Male", "456 Maple St", "123-123-7890", "Friend"));
        Admit_List.add(new Admit("Aurora", "Simmons", "Long", 33, "Female", "987 Oak St", "789-123-1230", "Family"));
        Admit_List.add(new Admit("Mason", "Hall", "Simmons", 26, "Male", "321 Maple St", "123-456-7890", "Friend"));
        Admit_List.add(new Admit("Harper", "Clark", "Hall", 29, "Female", "654 Elm St", "789-123-4560", "Family"));
        Admit_List.add(new Admit("Elijah", "Hill", "Clark", 24, "Male", "789 Oak St", "123-789-1230", "Friend"));
        Admit_List.add(new Admit("Avery", "Barnes", "Hill", 28, "Female", "654 Pine St", "789-456-7890", "Family"));
        Admit_List.add(new Admit("Evelyn", "Allen", "Barnes", 31, "Female", "987 Elm St", "123-123-7890", "Friend"));
        Admit_List.add(new Admit("Ella", "Cook", "Allen", 30, "Female", "456 Oak St", "789-789-1230", "Family"));
        Admit_List.add(new Admit("Jack", "Howard", "Cook", 25, "Male", "789 Maple St", "123-456-7890", "Friend"));
        Admit_List.add(new Admit("Scarlett", "Stewart", "Howard", 27, "Female", "654 Elm St", "789-123-4560", "Family"));
        Admit_List.add(new Admit("David", "Perry", "Stewart", 33, "Male", "321 Pine St", "123-789-1230", "Friend"));
        Admit_List.add(new Admit("Grace", "Turner", "Perry", 28, "Female", "987 Elm St", "789-123-7890", "Family"));
        Admit_List.add(new Admit("Lucas", "Ward", "Turner", 26, "Male", "456 Oak St", "123-456-7890", "Friend"));
        Admit_List.add(new Admit("Madison", "Scott", "Ward", 32, "Female", "654 Pine St", "789-789-1230", "Family"));
        Admit_List.add(new Admit("William", "Reed", "Scott", 30, "Male", "789 Elm St", "123-123-7890", "Friend"));
        Admit_List.add(new Admit("Nora", "Murphy", "Reed", 29, "Female", "321 Maple St", "789-456-7890", "Family"));
        Admit_List.add(new Admit("Aiden", "Hill", "Murphy", 27, "Male", "987 Oak St", "123-789-1230", "Friend"));
        Admit_List.add(new Admit("Mia", "Anderson", "Hill", 28, "Female", "456 Elm St", "789-123-7890", "Family"));
        Admit_List.add(new Admit("James", "Garcia", "Anderson", 29, "Male", "789 Pine St", "123-456-7890", "Friend"));
        Admit_List.add(new Admit("Olivia", "Martinez", "Garcia", 30, "Female", "321 Elm St", "789-789-1230", "Family"));
        Admit_List.add(new Admit("Emma", "Lewis", "Martinez", 25, "Female", "654 Oak St", "123-123-7890", "Friend"));
        Admit_List.add(new Admit("Noah", "Robinson", "Lewis", 32, "Male", "987 Elm St", "789-123-7890", "Family"));
        Admit_List.add(new Admit("Ethan", "Cox", "Robinson", 29, "Male", "456 Maple St", "123-456-7890", "Friend"));
        Admit_List.add(new Admit("Isabella", "Richardson", "Cox", 27, "Female", "789 Oak St", "789-789-1230", "Family"));
        Admit_List.add(new Admit("Sophia", "Rivera", "Richardson", 26, "Female", "321 Pine St", "123-123-7890", "Friend"));
        Admit_List.add(new Admit("Elijah", "Ross", "Rivera", 31, "Male", "789 Elm St", "789-456-7890", "Family"));
        Admit_List.add(new Admit("Avery", "Bailey", "Ross", 24, "Female", "987 Maple St", "123-789-1230", "Friend"));
        Admit_List.add(new Admit("Aiden", "Stewart", "Bailey", 26, "Male", "654 Oak St", "789-123-4560", "Family"));
        Admit_List.add(new Admit("Oliver", "Simmons", "Stewart", 28, "Male", "321 Pine St", "123-456-7890", "Friend"));
        Admit_List.add(new Admit("Mia", "Hall", "Simmons", 33, "Female", "789 Elm St", "789-123-1230", "Family"));
        Admit_List.add(new Admit("Noah", "Clark", "Hall", 27, "Male", "654 Elm St", "123-789-4560", "Friend"));
        Admit_List.add(new Admit("Isabella", "Hill", "Clark", 30, "Female", "321 Pine St", "789-123-7890", "Family"));
        Admit_List.add(new Admit("Ethan", "Barnes", "Hill", 28, "Male", "987 Elm St", "123-456-7890", "Friend"));
        Admit_List.add(new Admit("Emma", "Allen", "Barnes", 26, "Female", "654 Oak St", "789-789-1230", "Family"));
        Admit_List.add(new Admit("Noah", "Cook", "Allen", 31, "Male", "789 Pine St", "123-123-7890", "Friend"));
        Admit_List.add(new Admit("Olivia", "Howard", "Cook", 25, "Female", "456 Elm St", "789-456-7890", "Family"));
        Admit_List.add(new Admit("Elijah", "Stewart", "Howard", 29, "Male", "789 Oak St", "123-789-1230", "Friend"));
        Admit_List.add(new Admit("Avery", "Turner", "Stewart", 27, "Female", "654 Pine St", "789-123-4560", "Family"));
        Admit_List.add(new Admit("Isabella", "Scott", "Turner", 32, "Female", "321 Elm St", "123-456-7890", "Friend"));
        Admit_List.add(new Admit("Oliver", "Reed", "Scott", 28, "Male", "789 Maple St", "789-789-1230", "Family"));
        Admit_List.add(new Admit("Emma", "Murphy", "Reed", 26, "Female", "456 Oak St", "123-123-7890", "Friend"));
        Admit_List.add(new Admit("Noah", "Hill", "Murphy", 29, "Male", "789 Elm St", "789-456-7890", "Family"));
        Admit_List.add(new Admit("Aiden", "Anderson", "Hill", 30, "Male", "321 Elm St", "123-789-1230", "Friend"));
        Admit_List.add(new Admit("Oliver", "Garcia", "Anderson", 25, "Male", "789 Oak St", "456-789-1230", "Family"));
        Admit_List.add(new Admit("Evelyn", "Martinez", "Garcia", 27, "Female", "654 Elm St", "789-123-7890", "Friend"));
        Admit_List.add(new Admit("Aiden", "Lewis", "Martinez", 31, "Male", "321 Pine St", "123-456-7890", "Family"));
        Admit_List.add(new Admit("Mia", "Robinson", "Lewis", 29, "Female", "987 Elm St", "789-789-1230", "Friend"));
        Admit_List.add(new Admit("Oliver", "Cox", "Robinson", 26, "Male", "654 Oak St", "123-123-7890", "Family"));
        Admit_List.add(new Admit("Noah", "Richardson", "Cox", 30, "Male", "789 Pine St", "789-456-7890", "Friend"));
        Admit_List.add(new Admit("Olivia", "Rivera", "Richardson", 25, "Female", "321 Elm St", "123-789-1230", "Family"));
        Admit_List.add(new Admit("Emma", "Ross", "Rivera", 31, "Female", "789 Oak St", "789-123-7890", "Friend"));
        Admit_List.add(new Admit("Oliver", "Bailey", "Ross", 28, "Male", "456 Pine St", "123-456-7890", "Family"));
        Admit_List.add(new Admit("Mia", "Stewart", "Bailey", 29, "Female", "987 Elm St", "789-789-1230", "Friend"));
        Admit_List.add(new Admit("Elijah", "Simmons", "Stewart", 30, "Male", "654 Oak St", "123-123-7890", "Family"));
        Admit_List.add(new Admit("Aiden", "Hall", "Simmons", 28, "Male", "789 Pine St", "789-456-7890", "Friend"));
        Admit_List.add(new Admit("Olivia", "Turner", "Hall", 26, "Female", "321 Elm St", "123-789-1230", "Family"));
        Admit_List.add(new Admit("Emma", "Clark", "Turner", 32, "Female", "987 Oak St", "789-123-7890", "Friend"));
        Admit_List.add(new Admit("Noah", "Hill", "Clark", 25, "Male", "456 Elm St", "123-456-7890", "Family"));
        Admit_List.add(new Admit("Avery", "Barnes", "Hill", 27, "Female", "789 Pine St", "789-789-1230", "Friend"));
        Admit_List.add(new Admit("Evelyn", "Allen", "Barnes", 29, "Female", "654 Oak St", "123-123-7890", "Family"));
        Admit_List.add(new Admit("Mia", "Cook", "Allen", 26, "Female", "321 Maple St", "789-456-7890", "Friend"));
        Admit_List.add(new Admit("James", "Howard", "Cook", 31, "Male", "987 Elm St", "123-789-1230", "Family"));
        Admit_List.add(new Admit("Oliver", "Stewart", "Howard", 30, "Male", "654 Pine St", "789-123-4560", "Friend"));
        Admit_List.add(new Admit("Emma", "Turner", "Stewart", 27, "Female", "321 Elm St", "123-456-7890", "Family"));
        Admit_List.add(new Admit("Ethan", "Scott", "Turner", 25, "Male", "987 Oak St", "789-789-1230", "Friend"));
        Admit_List.add(new Admit("Ella", "Reed", "Scott", 29, "Female", "654 Elm St", "123-123-7890", "Family"));
        Admit_List.add(new Admit("Aiden", "Murphy", "Reed", 26, "Male", "789 Pine St", "789-456-7890", "Friend"));
        Admit_List.add(new Admit("Olivia", "Hill", "Murphy", 30, "Female", "321 Elm St", "123-789-1230", "Family"));
        Admit_List.add(new Admit("Emma", "Garcia", "Hill", 27, "Female", "987 Maple St", "789-123-7890", "Friend"));
        Admit_List.add(new Admit("Oliver", "Martinez", "Garcia", 25, "Male", "654 Elm St", "123-456-7890", "Family"));
        Admit_List.add(new Admit("Noah", "Lewis", "Martinez", 31, "Male", "789 Oak St", "789-789-1230", "Friend"));
        Admit_List.add(new Admit("Emma", "Robinson", "Lewis", 29, "Female", "321 Pine St", "123-123-7890", "Family"));
        Admit_List.add(new Admit("Olivia", "Cox", "Robinson", 30, "Female", "987 Elm St", "789-456-7890", "Friend"));
        Admit_List.add(new Admit("Noah", "Richardson", "Cox", 28, "Male", "654 Oak St", "123-789-1230", "Family"));
        Admit_List.add(new Admit("Ella", "Rivera", "Richardson", 26, "Female", "321 Elm St", "789-123-7890", "Friend"));
        Admit_List.add(new Admit("Ethan", "Ross", "Rivera", 25, "Male", "789 Elm St", "123-456-7890", "Family"));
        Admit_List.add(new Admit("Oliver", "Bailey", "Ross", 31, "Male", "987 Oak St", "789-789-1230", "Friend"));
        Admit_List.add(new Admit("Emma", "Stewart", "Bailey", 28, "Female", "654 Pine St", "123-123-7890", "Family"));
        Admit_List.add(new Admit("Noah", "Simmons", "Stewart", 27, "Male", "321 Elm St", "789-456-7890", "Friend"));
        Admit_List.add(new Admit("Olivia", "Hall", "Simmons", 29, "Female", "987 Maple St", "123-789-1230", "Family"));
        Admit_List.add(new Admit("Ethan", "Turner", "Hall", 30, "Male", "654 Elm St", "789-123-7890", "Friend"));
        Admit_List.add(new Admit("Oliver", "Clark", "Turner", 28, "Male", "789 Oak St", "123-456-7890", "Family"));
        Admit_List.add(new Admit("Emma", "Hill", "Clark", 26, "Female", "654 Pine St", "789-789-1230", "Friend"));
        Admit_List.add(new Admit("Noah", "Barnes", "Hill", 25, "Male", "321 Elm St", "123-123-7890", "Family"));
        Admit_List.add(new Admit("Ella", "Allen", "Barnes", 31, "Female", "789 Elm St", "789-456-7890", "Friend"));
        Admit_List.add(new Admit("Aiden", "Cook", "Allen", 27, "Male", "987 Oak St", "123-789-1230", "Family"));
        Admit_List.add(new Admit("Emma", "Howard", "Cook", 30, "Female", "654 Elm St", "789-123-7890", "Friend"));
        Admit_List.add(new Admit("Noah", "Stewart", "Howard", 29, "Male", "321 Pine St", "123-456-7890", "Family"));
        Admit_List.add(new Admit("Ella", "Turner", "Stewart", 26, "Female", "789 Oak St", "789-789-1230", "Friend"));
        Admit_List.add(new Admit("Oliver", "Scott", "Turner", 30, "Male", "654 Elm St", "123-123-7890", "Family"));
        Admit_List.add(new Admit("Emma", "Reed", "Scott", 28, "Female", "321 Maple St", "789-456-7890", "Friend"));
        Admit_List.add(new Admit("Noah", "Murphy", "Reed", 26, "Male", "987 Elm St", "123-789-1230", "Family"));
        Admit_List.add(new Admit("Ella", "Hill", "Murphy", 25, "Female", "654 Pine St", "789-789-1230", "Friend"));
        Admit_List.add(new Admit("Ethan", "Garcia", "Hill", 31, "Male", "321 Elm St", "123-123-7890", "Family"));
        Admit_List.add(new Admit("Aiden", "Martinez", "Garcia", 30, "Male", "789 Oak St", "789-456-7890", "Friend"));
        Admit_List.add(new Admit("Emma", "Lewis", "Martinez", 27, "Female", "654 Elm St", "123-789-1230", "Family"));
        Admit_List.add(new Admit("Noah", "Robinson", "Lewis", 29, "Male", "987 Pine St", "789-123-7890", "Friend"));
        Admit_List.add(new Admit("Ella", "Cox", "Robinson", 28, "Female", "654 Elm St", "123-456-7890", "Family"));
        Admit_List.add(new Admit("Ethan", "Richardson", "Cox", 26, "Male", "789 Oak St", "789-789-1230", "Friend"));
        Admit_List.add(new Admit("Aiden", "Rivera", "Richardson", 30, "Male", "321 Elm St", "123-123-7890", "Family"));
        Admit_List.add(new Admit("Emma", "Ross", "Rivera", 29, "Female", "987 Pine St", "789-456-7890", "Friend"));
        Admit_List.add(new Admit("Noah", "Bailey", "Ross", 25, "Male", "654 Elm St", "123-789-1230", "Family"));

//        ------------------------------------To store all detail data --------------------------------------------------------------------------------

        List<Discharge>  Discharge_List = new ArrayList<>();

        Discharge_List.add(new Discharge("Kiran","Pramod","Dhoke",21,"Male","Shastri road,Thane","809-797-2852","Friend"));
        Discharge_List.add(new Discharge("John", "Doe", "Smith", 30, "Male", "123 Main St, Anytown", "555-123-4567", "Family"));
        Discharge_List.add(new Discharge("Jane", "Smith", "Johnson", 25, "Female", "456 Oak Ave, Springfield", "555-987-6543", "Friend"));
        Discharge_List.add(new Discharge("Michael", "Brown", "Miller", 40, "Male", "789 Elm St, Cityville", "555-555-5555", "Colleague"));
        Discharge_List.add(new Discharge("Emily", "Davis", "Wilson", 28, "Female", "101 Maple Rd, Townsville", "555-222-3333", "Neighbor"));
        Discharge_List.add(new Discharge("David", "Garcia", "Martinez", 35, "Male", "321 Pine St, Villageland", "555-444-7777", "Acquaintance"));
        Discharge_List.add(new Discharge("Maria", "Lopez", "Rodriguez", 22, "Female", "543 Birch Ave, Countryside", "555-888-9999", "Friend"));
        Discharge_List.add(new Discharge("James", "Lee", "Chen", 50, "Male", "777 Cedar Rd, Metropolis", "555-666-1234", "Family"));
        Discharge_List.add(new Discharge("Sophia", "Nguyen", "Tran", 32, "Female", "222 Oak St, Capital City", "555-333-7890", "Friend"));
        Discharge_List.add(new Discharge("Daniel", "Kim", "Wang", 27, "Male", "444 Elm Ave, Bigtown", "555-111-2222", "Colleague"));
        Discharge_List.add(new Discharge("Isabella", "Wong", "Cheng", 29, "Female", "999 Maple Rd, Townville", "555-444-3333", "Neighbor"));
        Discharge_List.add(new Discharge("Alexander", "Gupta", "Kumar", 35, "Male", "111 Pine St, Villageland", "555-999-7777", "Acquaintance"));
        Discharge_List.add(new Discharge("Mia", "Sato", "Takahashi", 21, "Female", "333 Birch Ave, Countryside", "555-333-1111", "Friend"));
        Discharge_List.add(new Discharge("Ethan", "Ramos", "Silva", 40, "Male", "666 Cedar Rd, Metropolis", "555-222-3333", "Family"));
        Discharge_List.add(new Discharge("Amelia", "Li", "Yang", 28, "Female", "888 Oak St, Capital City", "555-777-9999", "Friend"));
        Discharge_List.add(new Discharge("Oliver", "Ali", "Hassan", 24, "Male", "777 Elm Ave, Bigtown", "555-333-2222", "Colleague"));
        Discharge_List.add(new Discharge("Ava", "Suzuki", "Tanaka", 30, "Female", "222 Maple Rd, Townville", "555-666-4444", "Neighbor"));
        Discharge_List.add(new Discharge("William", "Gonzalez", "Lopez", 31, "Male", "999 Pine St, Villageland", "555-888-7777", "Acquaintance"));
        Discharge_List.add(new Discharge("Sofia", "Park", "Kim", 29, "Female", "333 Birch Ave, Countryside", "555-222-1111", "Friend"));
        Discharge_List.add(new Discharge("Henry", "Chen", "Wu", 55, "Male", "666 Cedar Rd, Metropolis", "555-999-3333", "Family"));
        Discharge_List.add(new Discharge("Ella", "Lopez", "Sanchez", 27, "Female", "888 Oak St, Capital City", "555-444-8888", "Friend"));

        Discharge_List.add(new Discharge("Liam", "Nguyen", "Nguyen", 25, "Male", "111 Pine St, Villageland", "555-666-7777", "Acquaintance"));
        Discharge_List.add(new Discharge("Mila", "Wang", "Zhang", 31, "Female", "555 Elm Ave, Bigtown", "555-333-4444", "Colleague"));
        Discharge_List.add(new Discharge("Noah", "Kim", "Lee", 27, "Male", "222 Maple Rd, Townville", "555-777-5555", "Neighbor"));
        Discharge_List.add(new Discharge("Chloe", "Sato", "Yamamoto", 29, "Female", "777 Oak St, Capital City", "555-888-4444", "Friend"));
        Discharge_List.add(new Discharge("James", "Ali", "Ahmed", 35, "Male", "333 Birch Ave, Countryside", "555-999-5555", "Family"));
        Discharge_List.add(new Discharge("Emma", "Ramos", "Martinez", 21, "Female", "666 Cedar Rd, Metropolis", "555-666-9999", "Friend"));
        Discharge_List.add(new Discharge("Benjamin", "Li", "Zhang", 23, "Male", "888 Elm Ave, Bigtown", "555-111-5555", "Colleague"));
        Discharge_List.add(new Discharge("Aria", "Gupta", "Kumar", 25, "Female", "444 Maple Rd, Townville", "555-333-7777", "Neighbor"));
        Discharge_List.add(new Discharge("Lucas", "Lopez", "Perez", 40, "Male", "999 Pine St, Villageland", "555-555-5555", "Acquaintance"));
        Discharge_List.add(new Discharge("Grace", "Park", "Kim", 27, "Female", "111 Oak St, Capital City", "555-888-7777", "Friend"));
        Discharge_List.add(new Discharge("Elijah", "Chen", "Wu", 32, "Male", "333 Birch Ave, Countryside", "555-444-1111", "Family"));
        Discharge_List.add(new Discharge("Lily", "Suzuki", "Tanaka", 26, "Female", "666 Cedar Rd, Metropolis", "555-111-2222", "Friend"));
        Discharge_List.add(new Discharge("Mason", "Gonzalez", "Rodriguez", 29, "Male", "888 Elm Ave, Bigtown", "555-777-3333", "Colleague"));
        Discharge_List.add(new Discharge("Zoe", "Nguyen", "Tran", 27, "Female", "444 Maple Rd, Townville", "555-999-4444", "Neighbor"));
        Discharge_List.add(new Discharge("Olivia", "Chen", "Huang", 30, "Female", "999 Pine St, Villageland", "555-444-7777", "Acquaintance"));
        Discharge_List.add(new Discharge("Ethan", "Sato", "Kobayashi", 22, "Male", "111 Oak St, Capital City", "555-111-4444", "Friend"));
        Discharge_List.add(new Discharge("Avery", "Gupta", "Singh", 33, "Female", "333 Birch Ave, Countryside", "555-333-7777", "Family"));
        Discharge_List.add(new Discharge("Harper", "Lopez", "Gomez", 26, "Female", "666 Cedar Rd, Metropolis", "555-555-2222", "Friend"));
        Discharge_List.add(new Discharge("Michael", "Lee", "Chen", 40, "Male", "888 Elm Ave, Bigtown", "555-777-5555", "Colleague"));
        Discharge_List.add(new Discharge("Scarlett", "Ali", "Khan", 24, "Female", "444 Maple Rd, Townville", "555-222-1111", "Neighbor"));

        Discharge_List.add(new Discharge("William", "Garcia", "Lopez", 35, "Male", "999 Pine St, Villageland", "555-444-5555", "Acquaintance"));
        Discharge_List.add(new Discharge("Abigail", "Wong", "Chen", 28, "Female", "111 Oak St, Capital City", "555-888-3333", "Friend"));
        Discharge_List.add(new Discharge("Logan", "Ramos", "Silva", 23, "Male", "333 Birch Ave, Countryside", "555-333-1111", "Family"));
        Discharge_List.add(new Discharge("Evelyn", "Sato", "Takahashi", 30, "Female", "666 Cedar Rd, Metropolis", "555-111-7777", "Friend"));
        Discharge_List.add(new Discharge("Daniel", "Chen", "Wu", 32, "Male", "888 Elm Ave, Bigtown", "555-444-3333", "Colleague"));
        Discharge_List.add(new Discharge("Elizabeth", "Gupta", "Kumar", 24, "Female", "444 Maple Rd, Townville", "555-999-4444", "Neighbor"));
        Discharge_List.add(new Discharge("Mason", "Lopez", "Perez", 40, "Male", "999 Pine St, Villageland", "555-555-5555", "Acquaintance"));
        Discharge_List.add(new Discharge("Sofia", "Park", "Kim", 26, "Female", "111 Oak St, Capital City", "555-888-7777", "Friend"));
        Discharge_List.add(new Discharge("Oliver", "Suzuki", "Tanaka", 27, "Male", "333 Birch Ave, Countryside", "555-333-1111", "Family"));
        Discharge_List.add(new Discharge("Isabella", "Gonzalez", "Rodriguez", 29, "Female", "666 Cedar Rd, Metropolis", "555-777-3333", "Friend"));
        Discharge_List.add(new Discharge("Lucas", "Lee", "Chen", 40, "Male", "888 Elm Ave, Bigtown", "555-444-5555", "Colleague"));
        Discharge_List.add(new Discharge("Aria", "Ali", "Khan", 24, "Female", "444 Maple Rd, Townville", "555-222-1111", "Neighbor"));
        Discharge_List.add(new Discharge("Ethan", "Nguyen", "Nguyen", 25, "Male", "111 Pine St, Villageland", "555-666-7777", "Acquaintance"));
        Discharge_List.add(new Discharge("Grace", "Wang", "Zhang", 31, "Female", "555 Elm Ave, Bigtown", "555-333-4444", "Colleague"));
        Discharge_List.add(new Discharge("Liam", "Kim", "Lee", 27, "Male", "222 Maple Rd, Townville", "555-777-5555", "Neighbor"));
        Discharge_List.add(new Discharge("Chloe", "Sato", "Yamamoto", 29, "Female", "777 Oak St, Capital City", "555-888-4444", "Friend"));
        Discharge_List.add(new Discharge("James", "Ali", "Ahmed", 35, "Male", "333 Birch Ave, Countryside", "555-999-5555", "Family"));
        Discharge_List.add(new Discharge("Emma", "Ramos", "Martinez", 21, "Female", "666 Cedar Rd, Metropolis", "555-666-9999", "Friend"));
        Discharge_List.add(new Discharge("Benjamin", "Li", "Zhang", 23, "Male", "888 Elm Ave, Bigtown", "555-111-5555", "Colleague"));
        Discharge_List.add(new Discharge("Aria", "Gupta", "Singh", 33, "Female", "333 Birch Ave, Countryside", "555-333-7777", "Family"));

        Discharge_List.add(new Discharge("Harper", "Lopez", "Gomez", 26, "Female", "666 Cedar Rd, Metropolis", "555-555-2222", "Friend"));
        Discharge_List.add(new Discharge("Michael", "Lee", "Chen", 40, "Male", "888 Elm Ave, Bigtown", "555-777-5555", "Colleague"));
        Discharge_List.add(new Discharge("Lily", "Suzuki", "Tanaka", 27, "Female", "444 Maple Rd, Townville", "555-999-4444", "Neighbor"));
        Discharge_List.add(new Discharge("Mason", "Gonzalez", "Rodriguez", 29, "Male", "999 Pine St, Villageland", "555-444-5555", "Acquaintance"));
        Discharge_List.add(new Discharge("Zoe", "Nguyen", "Tran", 30, "Female", "111 Oak St, Capital City", "555-888-3333", "Friend"));
        Discharge_List.add(new Discharge("Oliver", "Ali", "Khan", 24, "Male", "333 Birch Ave, Countryside", "555-333-1111", "Family"));
        Discharge_List.add(new Discharge("Ava", "Sato", "Takahashi", 22, "Female", "666 Cedar Rd, Metropolis", "555-111-7777", "Friend"));
        Discharge_List.add(new Discharge("William", "Chen", "Wu", 32, "Male", "888 Elm Ave, Bigtown", "555-444-3333", "Colleague"));
        Discharge_List.add(new Discharge("Amelia", "Gupta", "Kumar", 25, "Female", "444 Maple Rd, Townville", "555-999-4444", "Neighbor"));
        Discharge_List.add(new Discharge("Lucas", "Lopez", "Perez", 40, "Male", "999 Pine St, Villageland", "555-555-5555", "Acquaintance"));
        Discharge_List.add(new Discharge("Grace", "Park", "Kim", 26, "Female", "111 Oak St, Capital City", "555-888-7777", "Friend"));
        Discharge_List.add(new Discharge("Ethan", "Suzuki", "Tanaka", 27, "Male", "333 Birch Ave, Countryside", "555-333-1111", "Family"));
        Discharge_List.add(new Discharge("Aria", "Gonzalez", "Rodriguez", 29, "Female", "666 Cedar Rd, Metropolis", "555-777-3333", "Friend"));
        Discharge_List.add(new Discharge("Oliver", "Lee", "Chen", 40, "Male", "888 Elm Ave, Bigtown", "555-444-5555", "Colleague"));
        Discharge_List.add(new Discharge("Zoe", "Ali", "Khan", 24, "Female", "333 Birch Ave, Countryside", "555-222-1111", "Neighbor"));
        Discharge_List.add(new Discharge("Ethan", "Nguyen", "Nguyen", 25, "Male", "111 Pine St, Villageland", "555-666-7777", "Acquaintance"));
        Discharge_List.add(new Discharge("Chloe", "Wang", "Zhang", 31, "Female", "555 Elm Ave, Bigtown", "555-333-4444", "Colleague"));
        Discharge_List.add(new Discharge("James", "Kim", "Lee", 27, "Male", "222 Maple Rd, Townville", "555-777-5555", "Neighbor"));
        Discharge_List.add(new Discharge("Emma", "Sato", "Yamamoto", 29, "Female", "777 Oak St, Capital City", "555-888-4444", "Friend"));
        Discharge_List.add(new Discharge("Benjamin", "Ali", "Ahmed", 35, "Male", "333 Birch Ave, Countryside", "555-999-5555", "Family"));

        Discharge_List.add(new Discharge("Ella", "Ramos", "Martinez", 21, "Female", "666 Cedar Rd, Metropolis", "555-666-9999", "Friend"));
        Discharge_List.add(new Discharge("Alexander", "Li", "Zhang", 23, "Male", "888 Elm Ave, Bigtown", "555-111-5555", "Colleague"));
        Discharge_List.add(new Discharge("Mia", "Gupta", "Singh", 33, "Female", "333 Birch Ave, Countryside", "555-333-7777", "Family"));
        Discharge_List.add(new Discharge("Noah", "Lopez", "Gomez", 26, "Male", "666 Cedar Rd, Metropolis", "555-555-2222", "Friend"));
        Discharge_List.add(new Discharge("Chloe", "Lee", "Chen", 40, "Female", "888 Elm Ave, Bigtown", "555-444-5555", "Colleague"));
        Discharge_List.add(new Discharge("James", "Ali", "Khan", 24, "Male", "333 Birch Ave, Countryside", "555-222-1111", "Neighbor"));
        Discharge_List.add(new Discharge("Evelyn", "Nguyen", "Nguyen", 25, "Female", "111 Pine St, Villageland", "555-666-7777", "Acquaintance"));
        Discharge_List.add(new Discharge("Benjamin", "Wang", "Zhang", 31, "Male", "555 Elm Ave, Bigtown", "555-333-4444", "Colleague"));
        Discharge_List.add(new Discharge("Lily", "Kim", "Lee", 27, "Female", "222 Maple Rd, Townville", "555-777-5555", "Neighbor"));
        Discharge_List.add(new Discharge("Mason", "Sato", "Yamamoto", 29, "Male", "777 Oak St, Capital City", "555-888-4444", "Friend"));
        Discharge_List.add(new Discharge("Zoe", "Ali", "Ahmed", 35, "Female", "333 Birch Ave, Countryside", "555-999-5555", "Family"));
        Discharge_List.add(new Discharge("Oliver", "Ramos", "Martinez", 21, "Male", "666 Cedar Rd, Metropolis", "555-666-9999", "Friend"));
        Discharge_List.add(new Discharge("Emma", "Li", "Zhang", 23, "Female", "888 Elm Ave, Bigtown", "555-111-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ethan", "Gupta", "Singh", 33, "Male", "333 Birch Ave, Countryside", "555-333-7777", "Family"));
        Discharge_List.add(new Discharge("Grace", "Lopez", "Gomez", 26, "Female", "666 Cedar Rd, Metropolis", "555-555-2222", "Friend"));
        Discharge_List.add(new Discharge("James", "Lee", "Chen", 40, "Male", "888 Elm Ave, Bigtown", "555-444-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ella", "Ali", "Khan", 24, "Female", "333 Birch Ave, Countryside", "555-222-1111", "Neighbor"));
        Discharge_List.add(new Discharge("Ava", "Nguyen", "Nguyen", 25, "Female", "111 Pine St, Villageland", "555-666-7777", "Acquaintance"));
        Discharge_List.add(new Discharge("Oliver", "Wang", "Zhang", 31, "Male", "555 Elm Ave, Bigtown", "555-333-4444", "Colleague"));
        Discharge_List.add(new Discharge("Lily", "Kim", "Lee", 27, "Female", "222 Maple Rd, Townville", "555-777-5555", "Neighbor"));

        Discharge_List.add(new Discharge("Mason", "Sato", "Yamamoto", 29, "Male", "777 Oak St, Capital City", "555-888-4444", "Friend"));
        Discharge_List.add(new Discharge("Zoe", "Ali", "Ahmed", 35, "Female", "333 Birch Ave, Countryside", "555-999-5555", "Family"));
        Discharge_List.add(new Discharge("Oliver", "Ramos", "Martinez", 21, "Male", "666 Cedar Rd, Metropolis", "555-666-9999", "Friend"));
        Discharge_List.add(new Discharge("Emma", "Li", "Zhang", 23, "Female", "888 Elm Ave, Bigtown", "555-111-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ethan", "Gupta", "Singh", 33, "Male", "333 Birch Ave, Countryside", "555-333-7777", "Family"));
        Discharge_List.add(new Discharge("Grace", "Lopez", "Gomez", 26, "Female", "666 Cedar Rd, Metropolis", "555-555-2222", "Friend"));
        Discharge_List.add(new Discharge("James", "Lee", "Chen", 40, "Male", "888 Elm Ave, Bigtown", "555-444-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ella", "Ali", "Khan", 24, "Female", "333 Birch Ave, Countryside", "555-222-1111", "Neighbor"));
        Discharge_List.add(new Discharge("Ava", "Nguyen", "Nguyen", 25, "Female", "111 Pine St, Villageland", "555-666-7777", "Acquaintance"));
        Discharge_List.add(new Discharge("Oliver", "Wang", "Zhang", 31, "Male", "555 Elm Ave, Bigtown", "555-333-4444", "Colleague"));
        Discharge_List.add(new Discharge("Lily", "Kim", "Lee", 27, "Female", "222 Maple Rd, Townville", "555-777-5555", "Neighbor"));
        Discharge_List.add(new Discharge("Mason", "Sato", "Yamamoto", 29, "Male", "777 Oak St, Capital City", "555-888-4444", "Friend"));
        Discharge_List.add(new Discharge("Zoe", "Ali", "Ahmed", 35, "Female", "333 Birch Ave, Countryside", "555-999-5555", "Family"));
        Discharge_List.add(new Discharge("Oliver", "Ramos", "Martinez", 21, "Male", "666 Cedar Rd, Metropolis", "555-666-9999", "Friend"));
        Discharge_List.add(new Discharge("Emma", "Li", "Zhang", 23, "Female", "888 Elm Ave, Bigtown", "555-111-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ethan", "Gupta", "Singh", 33, "Male", "333 Birch Ave, Countryside", "555-333-7777", "Family"));
        Discharge_List.add(new Discharge("Grace", "Lopez", "Gomez", 26, "Female", "666 Cedar Rd, Metropolis", "555-555-2222", "Friend"));
        Discharge_List.add(new Discharge("James", "Lee", "Chen", 40, "Male", "888 Elm Ave, Bigtown", "555-444-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ella", "Ali", "Khan", 24, "Female", "333 Birch Ave, Countryside", "555-222-1111", "Neighbor"));
        Discharge_List.add(new Discharge("Ava", "Nguyen", "Nguyen", 25, "Female", "111 Pine St, Villageland", "555-666-7777", "Acquaintance"));
        Discharge_List.add(new Discharge("Oliver", "Wang", "Zhang", 31, "Male", "555 Elm Ave, Bigtown", "555-333-4444", "Colleague"));
        Discharge_List.add(new Discharge("Lily", "Kim", "Lee", 27, "Female", "222 Maple Rd, Townville", "555-777-5555", "Neighbor"));
        Discharge_List.add(new Discharge("Mason", "Sato", "Yamamoto", 29, "Male", "777 Oak St, Capital City", "555-888-4444", "Friend"));
        Discharge_List.add(new Discharge("Zoe", "Ali", "Ahmed", 35, "Female", "333 Birch Ave, Countryside", "555-999-5555", "Family"));
        Discharge_List.add(new Discharge("Oliver", "Ramos", "Martinez", 21, "Male", "666 Cedar Rd, Metropolis", "555-666-9999", "Friend"));
        Discharge_List.add(new Discharge("Emma", "Li", "Zhang", 23, "Female", "888 Elm Ave, Bigtown", "555-111-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ethan", "Gupta", "Singh", 33, "Male", "333 Birch Ave, Countryside", "555-333-7777", "Family"));
        Discharge_List.add(new Discharge("Grace", "Lopez", "Gomez", 26, "Female", "666 Cedar Rd, Metropolis", "555-555-2222", "Friend"));
        Discharge_List.add(new Discharge("James", "Lee", "Chen", 40, "Male", "888 Elm Ave, Bigtown", "555-444-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ella", "Ali", "Khan", 24, "Female", "333 Birch Ave, Countryside", "555-222-1111", "Neighbor"));
        Discharge_List.add(new Discharge("Ava", "Nguyen", "Nguyen", 25, "Female", "111 Pine St, Villageland", "555-666-7777", "Acquaintance"));
        Discharge_List.add(new Discharge("Oliver", "Wang", "Zhang", 31, "Male", "555 Elm Ave, Bigtown", "555-333-4444", "Colleague"));
        Discharge_List.add(new Discharge("Lily", "Kim", "Lee", 27, "Female", "222 Maple Rd, Townville", "555-777-5555", "Neighbor"));
        Discharge_List.add(new Discharge("Mason", "Sato", "Yamamoto", 29, "Male", "777 Oak St, Capital City", "555-888-4444", "Friend"));
        Discharge_List.add(new Discharge("Zoe", "Ali", "Ahmed", 35, "Female", "333 Birch Ave, Countryside", "555-999-5555", "Family"));
        Discharge_List.add(new Discharge("Oliver", "Ramos", "Martinez", 21, "Male", "666 Cedar Rd, Metropolis", "555-666-9999", "Friend"));
        Discharge_List.add(new Discharge("Emma", "Li", "Zhang", 23, "Female", "888 Elm Ave, Bigtown", "555-111-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ethan", "Gupta", "Singh", 33, "Male", "333 Birch Ave, Countryside", "555-333-7777", "Family"));
        Discharge_List.add(new Discharge("Grace", "Lopez", "Gomez", 26, "Female", "666 Cedar Rd, Metropolis", "555-555-2222", "Friend"));
        Discharge_List.add(new Discharge("James", "Lee", "Chen", 40, "Male", "888 Elm Ave, Bigtown", "555-444-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ella", "Ali", "Khan", 24, "Female", "333 Birch Ave, Countryside", "555-222-1111", "Neighbor"));
        Discharge_List.add(new Discharge("Ava", "Nguyen", "Nguyen", 25, "Female", "111 Pine St, Villageland", "555-666-7777", "Acquaintance"));
        Discharge_List.add(new Discharge("Oliver", "Wang", "Zhang", 31, "Male", "555 Elm Ave, Bigtown", "555-333-4444", "Colleague"));
        Discharge_List.add(new Discharge("Lily", "Kim", "Lee", 27, "Female", "222 Maple Rd, Townville", "555-777-5555", "Neighbor"));
        Discharge_List.add(new Discharge("Mason", "Sato", "Yamamoto", 29, "Male", "777 Oak St, Capital City", "555-888-4444", "Friend"));
        Discharge_List.add(new Discharge("Zoe", "Ali", "Ahmed", 35, "Female", "333 Birch Ave, Countryside", "555-999-5555", "Family"));
        Discharge_List.add(new Discharge("Oliver", "Ramos", "Martinez", 21, "Male", "666 Cedar Rd, Metropolis", "555-666-9999", "Friend"));
        Discharge_List.add(new Discharge("Emma", "Li", "Zhang", 23, "Female", "888 Elm Ave, Bigtown", "555-111-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ethan", "Gupta", "Singh", 33, "Male", "333 Birch Ave, Countryside", "555-333-7777", "Family"));
        Discharge_List.add(new Discharge("Grace", "Lopez", "Gomez", 26, "Female", "666 Cedar Rd, Metropolis", "555-555-2222", "Friend"));
        Discharge_List.add(new Discharge("James", "Lee", "Chen", 40, "Male", "888 Elm Ave, Bigtown", "555-444-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ella", "Ali", "Khan", 24, "Female", "333 Birch Ave, Countryside", "555-222-1111", "Neighbor"));
        Discharge_List.add(new Discharge("Ava", "Nguyen", "Nguyen", 25, "Female", "111 Pine St, Villageland", "555-666-7777", "Acquaintance"));
        Discharge_List.add(new Discharge("Oliver", "Wang", "Zhang", 31, "Male", "555 Elm Ave, Bigtown", "555-333-4444", "Colleague"));
        Discharge_List.add(new Discharge("Lily", "Kim", "Lee", 27, "Female", "222 Maple Rd, Townville", "555-777-5555", "Neighbor"));
        Discharge_List.add(new Discharge("Mason", "Sato", "Yamamoto", 29, "Male", "777 Oak St, Capital City", "555-888-4444", "Friend"));
        Discharge_List.add(new Discharge("Zoe", "Ali", "Ahmed", 35, "Female", "333 Birch Ave, Countryside", "555-999-5555", "Family"));
        Discharge_List.add(new Discharge("Oliver", "Ramos", "Martinez", 21, "Male", "666 Cedar Rd, Metropolis", "555-666-9999", "Friend"));
        Discharge_List.add(new Discharge("Emma", "Li", "Zhang", 23, "Female", "888 Elm Ave, Bigtown", "555-111-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ethan", "Gupta", "Singh", 33, "Male", "333 Birch Ave, Countryside", "555-333-7777", "Family"));
        Discharge_List.add(new Discharge("Grace", "Lopez", "Gomez", 26, "Female", "666 Cedar Rd, Metropolis", "555-555-2222", "Friend"));
        Discharge_List.add(new Discharge("James", "Lee", "Chen", 40, "Male", "888 Elm Ave, Bigtown", "555-444-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ella", "Ali", "Khan", 24, "Female", "333 Birch Ave, Countryside", "555-222-1111", "Neighbor"));
        Discharge_List.add(new Discharge("Ava", "Nguyen", "Nguyen", 25, "Female", "111 Pine St, Villageland", "555-666-7777", "Acquaintance"));
        Discharge_List.add(new Discharge("Oliver", "Wang", "Zhang", 31, "Male", "555 Elm Ave, Bigtown", "555-333-4444", "Colleague"));
        Discharge_List.add(new Discharge("Lily", "Kim", "Lee", 27, "Female", "222 Maple Rd, Townville", "555-777-5555", "Neighbor"));
        Discharge_List.add(new Discharge("Mason", "Sato", "Yamamoto", 29, "Male", "777 Oak St, Capital City", "555-888-4444", "Friend"));
        Discharge_List.add(new Discharge("Zoe", "Ali", "Ahmed", 35, "Female", "333 Birch Ave, Countryside", "555-999-5555", "Family"));
        Discharge_List.add(new Discharge("Oliver", "Ramos", "Martinez", 21, "Male", "666 Cedar Rd, Metropolis", "555-666-9999", "Friend"));
        Discharge_List.add(new Discharge("Emma", "Li", "Zhang", 23, "Female", "888 Elm Ave, Bigtown", "555-111-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ethan", "Gupta", "Singh", 33, "Male", "333 Birch Ave, Countryside", "555-333-7777", "Family"));
        Discharge_List.add(new Discharge("Grace", "Lopez", "Gomez", 26, "Female", "666 Cedar Rd, Metropolis", "555-555-2222", "Friend"));
        Discharge_List.add(new Discharge("James", "Lee", "Chen", 40, "Male", "888 Elm Ave, Bigtown", "555-444-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ella", "Ali", "Khan", 24, "Female", "333 Birch Ave, Countryside", "555-222-1111", "Neighbor"));
        Discharge_List.add(new Discharge("Ava", "Nguyen", "Nguyen", 25, "Female", "111 Pine St, Villageland", "555-666-7777", "Acquaintance"));
        Discharge_List.add(new Discharge("Oliver", "Wang", "Zhang", 31, "Male", "555 Elm Ave, Bigtown", "555-333-4444", "Colleague"));
        Discharge_List.add(new Discharge("Lily", "Kim", "Lee", 27, "Female", "222 Maple Rd, Townville", "555-777-5555", "Neighbor"));
        Discharge_List.add(new Discharge("Mason", "Sato", "Yamamoto", 29, "Male", "777 Oak St, Capital City", "555-888-4444", "Friend"));
        Discharge_List.add(new Discharge("Zoe", "Ali", "Ahmed", 35, "Female", "333 Birch Ave, Countryside", "555-999-5555", "Family"));
        Discharge_List.add(new Discharge("Oliver", "Ramos", "Martinez", 21, "Male", "666 Cedar Rd, Metropolis", "555-666-9999", "Friend"));
        Discharge_List.add(new Discharge("Emma", "Li", "Zhang", 23, "Female", "888 Elm Ave, Bigtown", "555-111-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ethan", "Gupta", "Singh", 33, "Male", "333 Birch Ave, Countryside", "555-333-7777", "Family"));
        Discharge_List.add(new Discharge("Grace", "Lopez", "Gomez", 26, "Female", "666 Cedar Rd, Metropolis", "555-555-2222", "Friend"));
        Discharge_List.add(new Discharge("James", "Lee", "Chen", 40, "Male", "888 Elm Ave, Bigtown", "555-444-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ella", "Ali", "Khan", 24, "Female", "333 Birch Ave, Countryside", "555-222-1111", "Neighbor"));
        Discharge_List.add(new Discharge("Ava", "Nguyen", "Nguyen", 25, "Female", "111 Pine St, Villageland", "555-666-7777", "Acquaintance"));
        Discharge_List.add(new Discharge("Oliver", "Wang", "Zhang", 31, "Male", "555 Elm Ave, Bigtown", "555-333-4444", "Colleague"));
        Discharge_List.add(new Discharge("Lily", "Kim", "Lee", 27, "Female", "222 Maple Rd, Townville", "555-777-5555", "Neighbor"));
        Discharge_List.add(new Discharge("Mason", "Sato", "Yamamoto", 29, "Male", "777 Oak St, Capital City", "555-888-4444", "Friend"));
        Discharge_List.add(new Discharge("Zoe", "Ali", "Ahmed", 35, "Female", "333 Birch Ave, Countryside", "555-999-5555", "Family"));
        Discharge_List.add(new Discharge("Oliver", "Ramos", "Martinez", 21, "Male", "666 Cedar Rd, Metropolis", "555-666-9999", "Friend"));
        Discharge_List.add(new Discharge("Emma", "Li", "Zhang", 23, "Female", "888 Elm Ave, Bigtown", "555-111-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ethan", "Gupta", "Singh", 33, "Male", "333 Birch Ave, Countryside", "555-333-7777", "Family"));
        Discharge_List.add(new Discharge("Grace", "Lopez", "Gomez", 26, "Female", "666 Cedar Rd, Metropolis", "555-555-2222", "Friend"));
        Discharge_List.add(new Discharge("James", "Lee", "Chen", 40, "Male", "888 Elm Ave, Bigtown", "555-444-5555", "Colleague"));
        Discharge_List.add(new Discharge("Ella", "Ali", "Khan", 24, "Female", "333 Birch Ave, Countryside", "555-222-1111", "Neighbor"));
        Discharge_List.add(new Discharge("Ava", "Nguyen", "Nguyen", 25, "Female", "111 Pine St, Villageland", "555-666-7777", "Acquaintance"));
        Discharge_List.add(new Discharge("Oliver", "Wang", "Zhang", 31, "Male", "555 Elm Ave, Bigtown", "555-333-4444", "Colleague"));
        Discharge_List.add(new Discharge("Lily", "Kim", "Lee", 27, "Female", "222 Maple Rd, Townville", "555-777-5555", "Neighbor"));
        Discharge_List.add(new Discharge("Mason", "Sato", "Yamamoto", 29, "Male", "777 Oak St, Capital City", "555-888-4444", "Friend"));


//-----------------------------------------To Print all data--------------------------------------------------------------------------










//      To Print  Manage_Accouts data
//        for(Manage_Accouts Man_Account : Manage_Accouts_Lists){
//            Man_Account.Manage_Accouts_Info();
//            System.out.println("=====================================================================================");
//        }


// to Print Departments info

//        for(Departments Dept : DepartmentsList){
//            Dept.Deptinfo();
//            System.out.println("=====================================================================================");
//        }

//        To print Insurance info

//        for(Insurance issues : InsuranceList){
//            issues.Insurance_Info();
//            System.out.println("===================================================================================");
//        }

//        To print Staff info

//        for(Management_staff Manages :managementStaffList){
//            Manages.Management_staff_Info();
//            System.out.println("===================================================================================");
//        }

//      To print Accounts info

//        for (Accounts account : accountsList) {
//            account.AccountInfo();
//            System.out.println("================================");
//        }

//


//
////        To remove account data  data from admit class
//

//

//
////        To select / display  data from admit class
//
//        for(Admit Ad : Admit_List){
//            if (Ad.getPatient_First_name().equals(Patient_first_name) && Ad.getPatient_Middle_name().equals(Patient_Middle_name) && Ad.getPatient_Last_name().equals(Patient_Last_name)) {
//                Ad.AdmitInfo();
//                System.out.println("====================================================================================================");
//                break; // Found the matching object, no need to continue the loop.
//            }
//        }
//
//
//

//
////        To store Discharge data
//
//


//        ----------------------------------------Switch case logic for Admit and Discharge class

//        int choice;
//        do {
//            System.out.println("========= Menu =========");
//            System.out.println("1. Add Admit data");
//            System.out.println("2. Display Admit data");
//            System.out.println("3. To Remove specific data from Admit class");
//            System.out.println("4. To get specific data from Admit class");
//            System.out.println("5. Add Discharge data");
//            System.out.println("6. Display Discharge data");
//            System.out.println("7. To Remove specific data from Discharge class");
//            System.out.println("8. To get specific data from Discharge class");
//            System.out.println("0. Exit");
//            System.out.println("========================");
//            System.out.println("Enter your choice: ");
//            choice = sc.nextInt();
//            sc.nextLine(); // Consume the newline left by nextInt()
//
//            switch (choice) {
//                case 1:
////                    --------------------------------Add Admit data-------------------------
//
////                    -------------------------------Take user input ------------------------------------------------------------
//
//                    System.out.println("Enter Patient_First_name : ");
//                    String patient_first_name = sc.nextLine();
//
//                    System.out.println("Enter Patient_Middle_name : ");
//                    String patient_Middle_name = sc.nextLine();
//
//                    System.out.println("Enter Patient_Last_name : ");
//                    String patient_Last_name = sc.nextLine();
//
//                    System.out.println("Enter Patient_Age : ");
//                    int Patient_Age = sc.nextInt();
//                    sc.nextLine();
//
//                    System.out.println("Enter Patient_Sex: ");
//                    String Patient_sex = sc.nextLine();
//
//                    System.out.println("Enter Patient_Address : ");
//                    String Patient_Address = sc.nextLine();
//
//                    System.out.println("Enter  Patient_MbNo : ");
//                    String  Patient_MbNo = sc.nextLine();
//
//                    System.out.println("Enter  Patient_Realtion :");
//                    String  Patient_Realtion = sc.nextLine();
//
////                   ----------------------To add data into admit class ----------------------------------------------------
//
//                    for(Admit A : Admit_List){
//                        A.setPatient_First_name(patient_first_name);
//                        A.setPatient_Middle_name(patient_Middle_name);
//                        A.setPatient_Last_name(patient_Last_name);
//                        A.setPatient_Age(Patient_Age);
//                        A.setPatient_Sex(Patient_sex);
//                        A.setPatient_Address(Patient_Address);
//                        A.setPatient_MbNo(Patient_MbNo);
//                        A.setPatient_Realtion(Patient_Realtion);
//                        System.out.println("Patient data has been added : "+A.getPatient_First_name());
//                        break;
//                    }
//                    break;
//
//                case 2:
////                    Display Admit data
////                    To print All Admit Patient data
//                    for(Admit Ad : Admit_List){
//                        Ad.AdmitInfo();
//                        System.out.println("===========================================================================================");
//                        break;
//                    }
//                    break;
//
//                case 3:
////                    To Remove specific data from Admit class
////                    To take input from user
//
//
//                    System.out.println("Enter Patient first name : ");
//                    String Patient_first_name = sc.nextLine();
//
//                    System.out.println("Enter Patient Middle name : ");
//                    String Patient_Middle_name = sc.nextLine();
//
//                    System.out.println("Enter Patient_Last_name : ");
//                    String Patient_Last_name = sc.nextLine();
//
////                    To checkk and remove specified object
//
////                    To Select what to remove From admit class
////                    List<Admit>  Admit_list = new ArrayList<>();
//                    Admit objectToRemove = null;
//
//                    for (Admit Ad : Admit_List) {
//                        if (Ad.getPatient_First_name().equals(Patient_first_name) && Ad.getPatient_Middle_name().equals(Patient_Middle_name) && Ad.getPatient_Last_name().equals(Patient_Last_name)) {
//                            objectToRemove = Ad;
//                            System.out.println("data found");
//                            break; // Found the matching object, no need to continue the loop.
//                        }
//                    }
//
//
////        // Now, remove the object from the list:
//
//
//                    if (objectToRemove != null) {
//                        Admit_List.remove(objectToRemove);
//                        System.out.println("Data for following patient is removed " + objectToRemove.getPatient_First_name());
//                        // At this point, the object "John Doe Smith "  is no longer accessible,
//                        // and the garbage collector will eventually reclaim its memory.
//                    } else {
//                        System.out.println("No matching object found.");
//                    }
//
//                    break;
//
//                case 4:
////                    To get specific data from Admit class
//                    System.out.println("Enter Patient first name : ");
//                    String Admit_Patient_first_name = sc.nextLine();
//
//                    System.out.println("Enter Patient Middle name : ");
//                    String Admit_Patient_Middle_name = sc.nextLine();
//
//                    System.out.println("Enter Patient_Last_name : ");
//                    String Admit_Patient_Last_name = sc.nextLine();
////                     To select / display specific Admit data from admit class
//
//                    for (Admit Ad : Admit_List){
//                        if (Ad.getPatient_First_name().equals(Admit_Patient_first_name) && Ad.getPatient_Middle_name().equals(Admit_Patient_Middle_name) && Ad.getPatient_Last_name().equals(Admit_Patient_Last_name)) {
//                            Ad.Admit_add(Ad.getPatient_First_name(),Ad.getPatient_Middle_name(),Ad.getPatient_Last_name(),Ad.getPatient_Age(),Ad.getPatient_Sex(),Ad.getPatient_Address(),Ad.getPatient_MbNo(),Ad.getPatient_Realtion());
//                            Ad.AdmitInfo();
//                            System.out.println("====================================================================================================================");
//                            break; // Found the matching object, no need to continue the loop.
//                        }
//                    }
//
//                    break;
//
//                case 5:
//// ---------------------------------------Add Discharge data --------------------------------------------------
//
//// ---------------------------------------Take user input --------------------------------------------------------
//                    System.out.println("Enter Discharge_Patient_First_name : ");
//                    String discharge_patient_first_name = sc.nextLine();
//
//                    System.out.println("Enter Discharge_Patient_Middle_name : ");
//                    String discharge_patient_Middle_name = sc.nextLine();
//
//                    System.out.println("Enter Discharge_Patient_Last_name : ");
//                    String discharge_patient_Last_name = sc.nextLine();
//
//                    System.out.println("Enter Discharge_Patient_Age : ");
//                    int discharge_Patient_Age = sc.nextInt();
//                    sc.nextLine();
//
//                    System.out.println("Enter Discharge_Patient_Sex: ");
//                    String enter_sex = sc.nextLine();
//
//                    System.out.println("Enter Discharge_Patient_Address : ");
//                    String discharge_Patient_Address = sc.nextLine();
//
//                    System.out.println("Enter  Discharge_Patient_MbNo : ");
//                    String  discharge_Patient_MbNo = sc.nextLine();
//
//                    System.out.println("Enter  Discharge_Patient_Realtion :");
//                    String  discharge_Patient_Realtion = sc.nextLine();
//
////                    Add data into dischare class
//                    for(Discharge diS : Discharge_List){
//                        diS.setDischarge_Patient_First_name(discharge_patient_first_name);
//                        diS.setDischarge_Patient_Middle_name(discharge_patient_Middle_name);
//                        diS.setDischarge_Patient_Last_name(discharge_patient_Last_name);
//                        diS.setDischarge_Patient_Age(discharge_Patient_Age);
//                        diS.setDischarge_Patient_Sex(enter_sex);
//                        diS.setDischarge_Patient_Address(discharge_Patient_Address);
//                        diS.setDischarge_Patient_MbNo(discharge_Patient_MbNo);
//                        diS.setDischarge_Patient_Realtion(discharge_Patient_Realtion);
//                        diS.Discharge_Info();
//                        System.out.println("Data is added for : "+diS.Discharge_getPatient_First_name());
//                        break;
//                    }
//
//
//                    break;
//
//                case 6:
////                    Display Discharge data
//                    //        ---------------------------------To print all discharge data ---------------------------------------------------------------
//                    for(Discharge Dis : Discharge_List){
//                        Dis.Discharge_Info();
//                        System.out.println("===========================================================");
//                    }
//
//                    break;
//
//                case 7:
////                    To Remove specific data from Discharge class
//
////                    Take user input
//
//                    System.out.println("Enter Patient first name : ");
//                    String discharge_Patient_first_name = sc.nextLine();
//
//                    System.out.println("Enter Patient Middle name : ");
//                    String discharge_Patient_Middle_name = sc.nextLine();
//
//                    System.out.println("Enter Patient_Last_name : ");
//                    String discharge_Patient_Last_name = sc.nextLine();
//
////                    object declare to remove
//
//                    Discharge ObjectToremove = null;
////  ---------------------------------to select specific data from Discharge class to remove
//                    for(Discharge di : Discharge_List){
//                        if(di.Discharge_getPatient_First_name().equals(discharge_Patient_first_name) && di.Discharge_getPatient_Middle_name().equals(discharge_Patient_Middle_name) && di.Discharge_getPatient_Last_name().equals(discharge_Patient_Last_name)){
//                            ObjectToremove = di;
//                            System.out.println("data found");
//                            break;
//                        }
//                    }
////----------------------------To remove specific data from discharge table
//                    if (ObjectToremove != null) {
//                        Admit_List.remove(ObjectToremove);
//                        System.out.println("Data for following patient is removed " + ObjectToremove.Discharge_getPatient_First_name());
//                        // At this point, the object "John Doe Smith "  is no longer accessible,
//                        // and the garbage collector will eventually reclaim its memory.
//                    } else {
//                        System.out.println("No matching object found.");
//                    }
//
//                    break;
//
//                case 8:
////                    To access specific data from discharge data
//
////                    -------------------------------------------------To get user input --------------------------------------------
//                    System.out.println("Enter Patient first name : ");
//                    String Discharge_Patient_first_name = sc.nextLine();
//
//                    System.out.println("Enter Patient Middle name : ");
//                    String Discharge_Patient_Middle_name = sc.nextLine();
//
//                    System.out.println("Enter Patient_Last_name : ");
//                    String Discharge_Patient_Last_name = sc.nextLine();
////                     To select / display specific discharge data from admit class
//
//                    for (Discharge Di : Discharge_List){
//
//
//                        if (Di.Discharge_getPatient_First_name().equals(Discharge_Patient_first_name) && Di.Discharge_getPatient_Middle_name().equals(Discharge_Patient_Middle_name) && Di.Discharge_getPatient_Last_name().equals(Discharge_Patient_Last_name)) {
//                            Di.Discharge_add(Di.Discharge_getPatient_First_name(), Di.Discharge_getPatient_Middle_name(), Di.Discharge_getPatient_Last_name(), Di.Discharge_getPatient_Age(), Di.Discharge_getPatient_Sex(),Di.Discharge_getPatient_Address(),Di.Discharge_getPatient_MbNo(),Di.Discharge_getPatient_Realtion());
//                            Di.Discharge_Info();
//                            System.out.println("====================================================================================================================");
//                            break; // Found the matching object, no need to continue the loop.
//                        }
//                    }
////
//
//
//                    break;
//
//                case 0:
//                    System.out.println("Exiting the program. Goodbye!");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        } while (choice != 0);

//        ------------------------------------------Switch case Logic For Pharmacy staff ---------------------------------------------------------

//        int choice;
//        do{
//            System.out.println("========= Menu =========");
//            System.out.println("1. Add Pharmacy_Staff");
//            System.out.println("2. Display Pharmacy_Staff");
//            System.out.println("3. To get specific data from Pharmacy_Staff class");
//            System.out.println("4. To Remove specific data from Pharmacy_Staff class");
//            System.out.println("0. Exit");
//            System.out.println("========================");
//            System.out.println("Enter your choice: ");
//            choice = sc.nextInt();
//            sc.nextLine(); // Consume the newline left by nextInt()
//            switch (choice){
//                case 1:
////                    Add Pharmacy_Staff
//                    break;
//
//                case 2:
////                    Display Pharmacy_Staff
//                    //        To print Pharmacy_staff data
//                    for(Pharmacy_Staff Pharma : Pharmacy_Staff_List){
//                        Pharma.Pharmacy_Staff_Info();
//                        System.out.println("=====================================================================================");
//
//                    }
//                    break;
//
//                case 3:
////                    To get specific data from Pharmacy_Staff class
//                    break;
//
//                case 4:
////                    To Remove specific data from Pharmacy_Staff class
//                    break;
//
//                case 0:
//                    System.out.println("Exiting the program. Goodbye!");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }while(choice !=0);


//        --------------------------------------------Switch Case logic for Pharmacy _Medicine_Dealer----------------------------------------------

//        int choice;
//        do{
//            System.out.println("========= Menu =========");
//            System.out.println("1. Add Pharmacy Medicine dealer");
//            System.out.println("2. Display Pharmacy Medicine dealer");
//            System.out.println("3. To get specific data from Pharmacy Medicine dealer class");
//            System.out.println("4. To Remove specific data from Pharmacy Medicine dealer class");
//            System.out.println("0. Exit");
//            System.out.println("========================");
//            System.out.println("Enter your choice: ");
//            choice = sc.nextInt();
//            sc.nextLine(); // Consume the newline left by nextInt()
//            switch (choice){
//                case 1:
////                    Add Pharmacy Medicine dealer
//                    break;
//
//                case 2:
////                    Display Pharmacy Medicine dealer
//
//                    // To print Pharmacy Medicine dealer
//                    for(Pharmacy_Medicine Pharma_Med : Pharmacy_Medicine_List){
//                        Pharma_Med.Pharmacy_Medicine_Info();
//                        System.out.println("=====================================================================================");
//
//                    }
//                    break;
//
//                case 3:
////                    To get specific data from Pharmacy Medicine dealer class
//                    break;
//
//                case 4:
////                    To Remove specific data from Pharmacy Medicine dealer class
//                    break;
//
//                case 0:
//                    System.out.println("Exiting the program. Goodbye!");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }while(choice !=0);

//         ------------------------ switch case logic for Pharmacy Medicine Branded -------------------------------------

//        int choice;
//        do{
//            System.out.println("========= Menu =========");
//            System.out.println("1. Add Pharmacy Medicine Branded");
//            System.out.println("2. Display Pharmacy Medicine Branded");
//            System.out.println("3. To get specific data from Pharmacy Medicine Branded class");
//            System.out.println("4. To Remove specific data from Pharmacy Medicine Branded class");
//            System.out.println("0. Exit");
//            System.out.println("========================");
//            System.out.println("Enter your choice: ");
//            choice = sc.nextInt();
//            sc.nextLine(); // Consume the newline left by nextInt()
//            switch (choice){
//                case 1:
////                    Add Pharmacy Medicine
//
////                    To take User input
//
//                    System.out.println("Enter Pharmacy_Medicine_branded_Name : ");
//                    String Pharmacy_medicine_branded_Name = sc.nextLine();
//
//                    System.out.println("Enter Pharmacy_Medicine_branded_Manufracture : ");
//                    String Pharmacy_medicine_branded_Manufracture = sc.nextLine();
//
//                    System.out.println("Enter Pharmacy_Medicine_branded_Use : ");
//                    String Pharmacy_medicine_branded_Use = sc.nextLine();
//
//                    System.out.println("Enter Pharmacy_Medicine_branded_MfgNO : ");
//                    double Pharmacy_medicine_branded_MfgNO = sc.nextDouble();
//                    sc.nextLine();
//
//                    System.out.println("Enter Pharmacy_Medicine_branded_MfgDate : ");
//                    String Pharmacy_medicine_branded_MfgDate = sc.nextLine();
//
//                    System.out.println("Enter Pharmacy_Medicine_branded_Mfg_Loc : ");
//                    String Pharmacy_medicine_branded_Mfg_Loc = sc.nextLine();
//
//                    System.out.println("Enter Pharmacy_Medicine_branded_price : ");
//                    double Pharmacy_medicine_branded_price = sc.nextDouble();
//                    sc.nextLine();
//
//                    System.out.println("Enter Pharmacy_Medicine_branded_power : ");
//                    double Pharmacy_medicine_branded_power = sc.nextDouble();
//                    sc.nextLine();
//
////                    to add data into database
//
//                    for(Medicene_Branded mB : Medicene_Branded_List){
//                        mB.setMedicene_Branded_Name(Pharmacy_medicine_branded_Name);
//                        mB.setMedicene_Branded_Manufracture(Pharmacy_medicine_branded_Manufracture);
//                        mB.setMedicene_Branded_Use(Pharmacy_medicine_branded_Use);
//                        mB.setMedicene_Branded_MfgNO(Pharmacy_medicine_branded_MfgNO);
//                        mB.setMedicene_Branded_MfgDate(Pharmacy_medicine_branded_MfgDate);
//                        mB.setMedicene_Branded_Mfg_Loc(Pharmacy_medicine_branded_Mfg_Loc);
//                        mB.setMedicene_Branded_price(Pharmacy_medicine_branded_price);
//                        mB.setMedicene_Branded_Power(Pharmacy_medicine_branded_power);
//                        System.out.println("medicine_branded Data has been added for : "+mB.getMedicene_Branded_Name());
//
//                    }
//                    break;
//
//                case 2:
////                    Display Pharmacy Medicine Branded
//
//                    //  To print Medicene_Branded data
//                    for(Medicene_Branded MB : Medicene_Branded_List){
//                        MB.Medicene_Branded_info();
//                        System.out.println("=====================================================================================");
//
//                    }
//                    break;
//
//                case 3:
////                    To get specific data from Pharmacy Medicine Branded class
//
////                    Take user input
//
//                    System.out.println("Enter Pharmacy_Medicine_Branded_Name : ");
//                    String Pharmacy_Medicine_branded_name = sc.nextLine();
//
//                    System.out.println("Enter Pharmacy_Medicine_Branded_Manufracture : ");
//                    String Pharmacy_Branded_branded_manufracture = sc.nextLine();
//
//                    System.out.println("Enter Pharmacy_Medicine_Branded_Use : ");
//                    String Pharmacy_Medicine_branded_use = sc.nextLine();
//
//                    for(Medicene_Branded Mb : Medicene_Branded_List){
//                        if(Mb.getMedicene_Branded_Name().equals(Pharmacy_Medicine_branded_name) && Mb.getMedicene_Branded_Manufracture().equals(Pharmacy_Branded_branded_manufracture) && Mb.getMedicene_Branded_Use().equals(Pharmacy_Medicine_branded_use) ){
//                            Mb.Medicene_Branded_info();
//
//                        }
//                    }
//                    break;
//
//                case 4:
////                    To Remove specific data from Pharmacy Medicine Branded class
//
////                    To take user input
//
//                    System.out.println("Enter Pharmacy_Medicine_Branded_Name : ");
//                    String Pharmacy_Medicine_Branded_name = sc.nextLine();
//
//                    System.out.println("Enter Pharmacy_Medicine_Branded_Manufracture : ");
//                    String Pharmacy_Medicine_Branded_manufracture = sc.nextLine();
//
//                    System.out.println("Enter Pharmacy_Medicine_Branded_Use : ");
//                    String Pharmacy_Medicine_Branded_use = sc.nextLine();
//
////                    To find specific data to remove
//
//                    Medicene_Branded Objecttoremove = null;
//
//                    for(Medicene_Branded MB : Medicene_Branded_List){
//                        if(MB.getMedicene_Branded_Name().equals(Pharmacy_Medicine_Branded_name) && MB.getMedicene_Branded_Manufracture().equals(Pharmacy_Medicine_Branded_manufracture) && MB.getMedicene_Branded_Use().equals(Pharmacy_Medicine_Branded_use)){
//                            Objecttoremove = MB;
//                            System.out.println("Data found");
//                        }
//                    }
//
////                    To remove specific data
//
//                    if (Objecttoremove != null) {
//                        Medicine_Generic_List.remove(Objecttoremove);
//                        System.out.println("Data for following patient is removed " + Objecttoremove.getMedicene_Branded_Name());
//                        // At this point, the object "generic medicine  "  is no longer accessible,
//                        // and the garbage collector will eventually reclaim its memory.
//                    } else {
//                        System.out.println("No matching object found.");
//                    }
//                    break;
//
//                case 0:
//                    System.out.println("Exiting the program. Goodbye!");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }while(choice !=0);

//        ------------------------------------ Switch case logic for Pharmacy Medicine Generic--------------------------------------

        int choice;
        do{
            System.out.println("========= Menu =========");
            System.out.println("1. Add Pharmacy Medicine Generic");
            System.out.println("2. Display Pharmacy Medicine Generic");
            System.out.println("3. To get specific data from Pharmacy Medicine Generic class");
            System.out.println("4. To Remove specific data from Pharmacy Medicine Generic class");
            System.out.println("0. Exit");
            System.out.println("========================");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline left by nextInt()
            switch (choice){
                case 1:
//                    Add Pharmacy Medicine Generic

//                    To take user input

                    System.out.println("Enter Pharmacy_Medicine_Generic_Name : ");
                    String Pharmacy_Medicine_Generic_Name = sc.nextLine();

                    System.out.println("Enter Pharmacy_Medicine_Generic_Manufracture : ");
                    String Pharmacy_Medicine_Generic_Manufracture = sc.nextLine();

                    System.out.println("Enter Pharmacy_Medicine_Generic_Use : ");
                    String Pharmacy_Medicine_Generic_Use = sc.nextLine();

                    System.out.println("Enter Pharmacy_Medicine_Generic_MfgNO : ");
                    double Pharmacy_Medicine_Generic_MfgNO = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Pharmacy_Medicine_Generic_MfgDate : ");
                    String Pharmacy_Medicine_Generic_MfgDate = sc.nextLine();

                    System.out.println("Enter Pharmacy_Medicine_Generic_Mfg_Loc : ");
                    String Pharmacy_Medicine_Generic_Mfg_Loc = sc.nextLine();

                    System.out.println("Enter Pharmacy_Medicine_Generic_price : ");
                    double Pharmacy_Medicine_Generic_price = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Pharmacy_Medicine_Generic_power : ");
                    double Pharmacy_Medicine_Generic_power = sc.nextInt();
                    sc.nextLine();

                    for(Medicine_Generic Mg : Medicine_Generic_List){
                        Mg.setMedicine_Generic_Name(Pharmacy_Medicine_Generic_Name);
                        Mg.setMedicine_Generic_Manufracture(Pharmacy_Medicine_Generic_Manufracture);
                        Mg.setMedicine_Generic_Use(Pharmacy_Medicine_Generic_Use);
                        Mg.setMedicine_Generic_MfgNO(Pharmacy_Medicine_Generic_MfgNO);
                        Mg.setMedicine_Generic_MfgDate(Pharmacy_Medicine_Generic_MfgDate);
                        Mg.setMedicine_Generic_Mfg_Loc(Pharmacy_Medicine_Generic_Mfg_Loc);
                        Mg.setMedicine_Generic_price(Pharmacy_Medicine_Generic_price);
                        Mg.setMMedicine_Generic_Power(Pharmacy_Medicine_Generic_power);
                        System.out.println("Medicine_Generic Data has been added for : "+Mg.getMedicine_Generic_Name());

                    }
                    break;

                case 2:
//                    Display Pharmacy Medicine Generic

                    //  To print Medicene_Generic data

                    for(Medicine_Generic MG : Medicine_Generic_List){
                        MG.Medicine_Generic_info();
                        System.out.println("=====================================================================================");

                    }
                    break;

                case 3:
//                    To get specific data from Pharmacy Medicine Generic class

//                    Take user input

                    System.out.println("Enter Pharmacy_Medicine_Generic_Name : ");
                    String Pharmacy_Medicine_Generic_name = sc.nextLine();

                    System.out.println("Enter Pharmacy_Medicine_Generic_Manufracture : ");
                    String Pharmacy_Medicine_Generic_manufracture = sc.nextLine();

                    System.out.println("Enter Pharmacy_Medicine_Generic_Use : ");
                    String Pharmacy_Medicine_Generic_use = sc.nextLine();

                    for(Medicine_Generic mG : Medicine_Generic_List){
                        if(mG.getMedicine_Generic_Name().equals(Pharmacy_Medicine_Generic_name) && mG.getMedicine_Generic_Manufracture().equals(Pharmacy_Medicine_Generic_manufracture) && mG.getMedicine_Generic_Use().equals(Pharmacy_Medicine_Generic_use)){
                            mG.Medicine_Generic_info();
                        }
                    }
                    break;

                case 4:
//                    To Remove specific data from Pharmacy Medicine Generic class

//                    Take user input

                    System.out.println("Enter Pharmacy_Medicine_Generic_Name : ");
                    String Pharmacy_Medicine_generic_name = sc.nextLine();

                    System.out.println("Enter Pharmacy_Medicine_Generic_Manufracture : ");
                    String Pharmacy_Medicine_generic_manufracture = sc.nextLine();

                    System.out.println("Enter Pharmacy_Medicine_Generic_Use : ");
                    String Pharmacy_Medicine_generic_use = sc.nextLine();

//                    -------------To search speecific data into database

                    Medicine_Generic Objecttoremove = null;

                    for(Medicine_Generic mg : Medicine_Generic_List){
                        if(mg.getMedicine_Generic_Name().equals(Pharmacy_Medicine_generic_name) && mg.getMedicine_Generic_Manufracture().equals(Pharmacy_Medicine_generic_manufracture) && mg.getMedicine_Generic_Use().equals(Pharmacy_Medicine_generic_use)){
                            Objecttoremove = mg;
                            System.out.println("data found");

                        }
                    }
//                    -----------------to remove specific data from generic table ----------------------------------

                    if (Objecttoremove != null) {
                        Medicine_Generic_List.remove(Objecttoremove);
                        System.out.println("Data for following patient is removed " + Objecttoremove.getMedicine_Generic_Name());
                        // At this point, the object "generic medicine  "  is no longer accessible,
                        // and the garbage collector will eventually reclaim its memory.
                    } else {
                        System.out.println("No matching object found.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while(choice !=0);
    }
}

