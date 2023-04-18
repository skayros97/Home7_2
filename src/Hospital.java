public class Hospital {
    String nameOfUnhealthy;
    int index;
    String hir = "Хирург";
    String dant = "Дантист";
    String ter = "Терапефт";

    public Hospital(String nameOfUnhealthy, int index) {
        this.nameOfUnhealthy = nameOfUnhealthy;
        this.index = index;
    }
    public void heal(){
        System.out.println("План лечения для " + nameOfUnhealthy);
        if (index == 1){
            System.out.println(" Пациент " + nameOfUnhealthy + " Назначен на приём к " + hir);
        }
        else if (index == 2){
            System.out.println(" Пациент " + nameOfUnhealthy + " Назначен на приём к " + dant);
        }else  {
            System.out.println(" Пациент " + nameOfUnhealthy + " Назначен на приём к " + ter);
        }


    }

}
