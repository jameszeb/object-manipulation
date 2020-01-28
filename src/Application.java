import java.util.*;

public class Application {
 final static int c = 0;

    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        boolean flag = true;
        Scanner s = new Scanner(System.in);
        String answer;
        HashMap <String , Objectx> hm = new HashMap<String,Objectx>();


        while(flag){


            System.out.println("Choose how many properties you want your object to have. ( 1 - 5 )");
            answer = s.nextLine();
            ar.add(createObject(answer));
            hm.put(ar.get(ar.size()-1).toString(),(Objectx)ar.get(ar.size()-1));

            System.out.println("This is a list of your objects added so far to the list" + "\n");

            System.out.println("\n*---------------------*");
            for(int i = 0; i < ar.size(); i++){
                System.out.println(ar.get(i));
            }
            System.out.println("*---------------------*\n");
            System.out.println("");

            System.out.println("Would you like to change any of the properties on any of the Objects?");
            answer = s.nextLine();

            if(answer.equals("y")|| answer.equals("yes")){
                System.out.println("Which Object would you like to change? Please enter the Identification number: ");
                answer = s.nextLine();



                Collection arl = hm.keySet();


                Objectx a;
                ArrayList arr;

                for(int i = 0; i < ar.size(); i++){
                    a = (Objectx) ar.get(i);
                    System.out.println(a.getIdNumber());

                    if(a instanceof ObjectWith1Property){
                        if(answer.equals((a).idNumber)){
                            System.out.println("Which property would you like to change?");
                            for(Object abc : ((ObjectWith1Property) a).getProperties()){
                                System.out.println((String)abc);
                            }
                            answer = s.nextLine();

                            for(Object abc : ((ObjectWith1Property) a).getProperties()){
                                if(answer.equals(abc)){
                                    System.out.println("What would you like to set it to?");
                                    answer = s.nextLine();

                                }
                            }
                        }

                    } else if (a instanceof ObjectWith2Property) {
                        if(answer.equals(((ObjectWith2Property) a).idNumber)){
                            System.out.println("Which property would you like to change?");
                            for(Object abc : ((ObjectWith2Property) a).getProperties()){
                                System.out.println((String)abc);
                            }
                            answer = s.nextLine();

                            for(Object abc : ((ObjectWith2Property) a).getProperties()){
                                if(answer.equals(abc)){
                                    System.out.println("What would you like to set it to?");
                                    answer = s.nextLine();

                                }
                            }
                        }

                    } else if (a instanceof ObjectWith3Property) {
                        if(answer.equals((a).idNumber)){
                            System.out.println("Which property would you like to change?");
                            for(Object abc : ((ObjectWith3Property) a).getProperties()){
                                System.out.println((String)abc);
                            }
                            answer = s.nextLine();

                            for(Object abc : ((ObjectWith3Property) a).getProperties()){
                                if(answer.equals(abc)){
                                    System.out.println("What would you like to set it to?");
                                    answer = s.nextLine();

                                }
                            }
                        }

                    } else if (a instanceof ObjectWith4Property) {
                        if(answer.equals(((ObjectWith4Property) a).idNumber)){
                            System.out.println("Which property would you like to change?");
                            for(Object abc : ((ObjectWith4Property) a).getProperties()){
                                System.out.println((String)abc);
                            }
                            answer = s.nextLine();

                            for(Object abc : ((ObjectWith4Property) a).getProperties()){
                                if(answer.equals(abc)){
                                    System.out.println("What would you like to set it to?");
                                    answer = s.nextLine();

                                }
                            }
                        }

                    } else if (a instanceof ObjectWith5property) {
                        if(answer.equals(((ObjectWith5property) a).idNumber)){
                            System.out.println("Which property would you like to change?");
                            for(Object abc : ((ObjectWith5property) a).getProperties()){
                                System.out.println((String)abc);
                            }
                            answer = s.nextLine();

                            for(Object abc : ((ObjectWith5property) a).getProperties()){
                                if(answer.equals(abc)){
                                    System.out.println("What would you like to set it to?");
                                    answer = s.nextLine();

                                }
                            }
                        }

                    }





                    if(a.getIdNumber().equals(answer)){
                    System.out.println(a.getIdNumber());
                        System.out.println("Which property would you like to change?");
                        if(a instanceof ObjectWith1Property){
                            arr = ((ObjectWith1Property) a).getProperties();
                            for(Object prop : arr){
                                System.out.println((String)prop);
                            }

                        } else if (a instanceof ObjectWith2Property) {
                            arr = ((ObjectWith2Property) a).getProperties();
                            for(Object prop : arr){
                                System.out.println((String)prop);
                            }

                        } else if (a instanceof ObjectWith3Property) {
                            arr = ((ObjectWith3Property) a).getProperties();
                            for(Object prop : arr){
                                System.out.println((String)prop);
                            }

                        } else if (a instanceof ObjectWith4Property) {
                            arr = ((ObjectWith4Property) a).getProperties();
                            for(Object prop : arr){
                                System.out.println((String)prop);
                            }

                        } else if (a instanceof ObjectWith5property) {
                            arr = ((ObjectWith5property) a).getProperties();
                            for(Object prop : arr){
                                System.out.println((String)prop);
                            }

                        }

                    }



                }
            }


            System.out.println("Do you wish to continue?");
            answer = s.nextLine();
            if(answer.equals("no")|| answer.equals("n")){
                flag = false;
            }

        }


    }

    public static <T>T createObject(String answer){


        switch(answer){
            case "1":
                return (T) createObject1Property();

            case "2":
                return (T) createObject2Property();

            case "3":
                return (T) createObject3Property();

            case "4":
                return (T) createObject4Property();

            case "5":
                return (T) createObject5Property();

            default:
                System.out.println("You entered an incorrect choice. Please try again.");
        }

        Object a = new Object();
        System.out.println("A default object has been created in its place and will be removed if needed.");
        return (T) a;


    }




    public static ObjectWith1Property createObject1Property(){
            return new ObjectWith1Property();
    }

    public static ObjectWith2Property createObject2Property(){
            return new ObjectWith2Property();
    }
    public static ObjectWith3Property createObject3Property(){
            return new ObjectWith3Property();
    }
    public static ObjectWith4Property createObject4Property(){
            return new ObjectWith4Property();
    }
    public static ObjectWith5property createObject5Property(){
            return new ObjectWith5property();
    }

}




class Objectx{

    String idNumber;

    public String getIdNumber(){
        return idNumber;
    }


}



class ObjectWith1Property extends Objectx{
    Scanner s = new Scanner(System.in);
    String property1;


    public ObjectWith1Property(){

        System.out.println("Enter a property : ");
        property1 = s.nextLine();
        idNumber = UUID.randomUUID().toString().substring(0,3);

    }

    @Override
    public String toString(){
        return "Object with 1 properties: " + property1 + "   IDNumber = " + idNumber;
    }

    public void setProperty(){
        System.out.println("Modify this single property ...");
        property1 = s.nextLine();

    }



    public ArrayList getProperties(){
        ArrayList ar = new ArrayList();
        ar.add(property1);

        return ar;
    }
}

class ObjectWith2Property extends Objectx{
    Scanner s = new Scanner(System.in);
    String property1;
    String property2;



    public ObjectWith2Property(){
        System.out.println("Enter property 1: ");
        property1 = s.nextLine();
        System.out.println("Enter property 2: ");
        property2 = s.nextLine();

        idNumber = UUID.randomUUID().toString().substring(0,3);

    }

    public void setProperty(String property) {
        if(property == property1){
            System.out.println("What would you like to change it to?");
            property1 = s.nextLine();
        } else if(property == property2){
            System.out.println("What would you like to change it to?");
            property2 = s.nextLine();
        }
    }

    @Override
    public String toString(){
        return "Object with 2 properties: " + property1 + " " + property2  + "   IDNumber = " + idNumber;
    }

    public void modifyProperty(){
        System.out.println("Which property would you like to modify? ( 1 - 2 )");
        String answer = s.nextLine();

        switch(answer){
            case "1":
                System.out.println("Enter your new property: ");
                property1 = s.nextLine();
                break;
            case "2":
                System.out.println("Enter your new property: ");
                property1 = s.nextLine();
                break;
            default:
                System.out.println("You entered an incorrect value. Please try again.");
        }
    }


    public ArrayList getProperties(){
        ArrayList ar = new ArrayList();
        ar.add(property1);
        ar.add(property2);

        return ar;
    }

}

class ObjectWith3Property extends Objectx{
    Scanner s = new Scanner(System.in);
    String property1;
    String property2;
    String property3;




    public ObjectWith3Property(){
        System.out.println("Enter property 1: ");
        property1 = s.nextLine();
        System.out.println("Enter property 2: ");
        property2 = s.nextLine();
        System.out.println("Enter property 3: ");
        property3 = s.nextLine();

        idNumber = UUID.randomUUID().toString().substring(0,3);

    }

    public void setProperty(String property) {
        if(property == property1){
            System.out.println("What would you like to change it to?");
            property1 = s.nextLine();
        } else if(property == property2){
            System.out.println("What would you like to change it to?");
            property2 = s.nextLine();
        } else if(property == property3){
            System.out.println("What would you like to change it to?");
            property3 = s.nextLine();
        }
    }

    @Override
    public String toString(){
        return "Object with 3 properties: " + property1 + " " + property2 + " " + property3  + "   IDNumber = " + idNumber;
    }

    public void modifyProperty(){
        System.out.println("Which property would you like to modify? ( 1 - 3 )");
        String answer = s.nextLine();

        switch(answer){
            case "1":
                System.out.println("Enter your new property: ");
                property1 = s.nextLine();
                break;
            case "2":
                System.out.println("Enter your new property: ");
                property1 = s.nextLine();
                break;
            case "3":
                System.out.println("Enter your new property: ");
                property1 = s.nextLine();
                break;
            default:
                System.out.println("You entered an incorrect value. Please try again.");
        }
    }



    public ArrayList getProperties(){
        ArrayList ar = new ArrayList();
        ar.add(property1);
        ar.add(property2);
        ar.add(property3);

        return ar;
    }

}

class ObjectWith4Property extends Objectx{
    Scanner s = new Scanner(System.in);
    String property1;
    String property2;
    String property3;
    String property4;



    public ObjectWith4Property(){
        System.out.println("Enter property 1: ");
        property1 = s.nextLine();
        System.out.println("Enter property 2: ");
        property2 = s.nextLine();
        System.out.println("Enter property 3: ");
        property3 = s.nextLine();
        System.out.println("Enter property 4: ");
        property4 = s.nextLine();

        idNumber = UUID.randomUUID().toString().substring(0,3);

    }

    public void setProperty(String property) {
        if(property == property1){
            System.out.println("What would you like to change it to?");
            property1 = s.nextLine();
        } else if(property == property2){
            System.out.println("What would you like to change it to?");
            property2 = s.nextLine();
        } else if(property3 == property){
            System.out.println("What would you like to change it to?");
            property3 = s.nextLine();
        } else if(property4 == property){
            System.out.println("What would you like to change it to?");
            property4 = s.nextLine();
        }
    }

    @Override
    public String toString(){
        return "Object with 4 properties: " + property1 + " " + property2 + " " + property3 + " " + property4 + "   IDNumber = " + idNumber ;
    }

    public void modifyProperty(){
        System.out.println("Which property would you like to modify? ( 1 - 4 )");
        String answer = s.nextLine();

        switch(answer){
            case "1":
                System.out.println("Enter your new property: ");
                property1 = s.nextLine();
                break;
            case "2":
                System.out.println("Enter your new property: ");
                property1 = s.nextLine();
                break;
            case "3":
                System.out.println("Enter your new property: ");
                property1 = s.nextLine();
                break;
            case "4":
                System.out.println("Enter your new property: ");
                property1 = s.nextLine();
                break;
            default:
                System.out.println("You entered an incorrect value. Please try again.");
        }
    }


    public ArrayList getProperties(){
        ArrayList ar = new ArrayList();
        ar.add(property1);
        ar.add(property2);
        ar.add(property3);
        ar.add(property4);

        return ar;
    }

}

class ObjectWith5property extends Objectx{

    Scanner s = new Scanner(System.in);
    String property1;
    String property2;
    String property3;
    String property4;
    String property5;


    public ObjectWith5property(){
        System.out.println("Enter property 1: ");
        property1 = s.nextLine();
        System.out.println("Enter property 2: ");
        property2 = s.nextLine();
        System.out.println("Enter property 3: ");
        property3 = s.nextLine();
        System.out.println("Enter property 4: ");
        property4 = s.nextLine();
        System.out.println("Enter property 5: ");
        property5 = s.nextLine();

        idNumber = UUID.randomUUID().toString().substring(0,3);
    }

    public void setProperty(String property) {
        if(property == property1){
            System.out.println("What would you like to change it to?");
            property1 = s.nextLine();
        } else if(property == property2){
            System.out.println("What would you like to change it to?");
            property2 = s.nextLine();
        } else if(property3 == property){
            System.out.println("What would you like to change it to?");
            property3 = s.nextLine();
        } else if(property4 == property){
            System.out.println("What would you like to change it to?");
            property4 = s.nextLine();
        } else if(property5 == property){
            System.out.println("What would you like to change it to?");
            property5 = s.nextLine();
        }
    }


    @Override
    public String toString(){
        return "Object with 5 properties: " + property1 + " " + property2 + " " + property3 + " " + property4 + " " + property5 + "   IDNumber = " + idNumber;
    }

    public void modifyProperty(){
        System.out.println("Which property would you like to modify? ( 1 - 5 )");
        String answer = s.nextLine();
        switch(answer){
            case "1":
                System.out.println("Enter your new property: ");
                property1 = s.nextLine();
                break;
            case "2":
                System.out.println("Enter your new property: ");
                property1 = s.nextLine();
                break;
            case "3":
                System.out.println("Enter your new property: ");
                property1 = s.nextLine();
                break;
            case "4":
                System.out.println("Enter your new property: ");
                property1 = s.nextLine();
                break;
            case "5":
                System.out.println("Enter your new property: ");
                property1 = s.nextLine();
                break;
            default:
                System.out.println("You entered an incorrect value. Please try again.");
        }
    }



    public ArrayList getProperties(){
        ArrayList ar = new ArrayList();
        ar.add(property1);
        ar.add(property2);
        ar.add(property3);
        ar.add(property4);
        ar.add(property5);
        return ar;
    }

}