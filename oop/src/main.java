public class main {




    public static void main (String[] args) {

        Car t1 = new Car(new DizelEngine());
        Car t2 = new Car(new DizelEngine());
        Car t3 = new Car(new DizelEngine());
        Car t4 = new Car(new DizelEngine());

        t1.getEngine().start();

        t1.setName("toyota");
        t2.setName("nissan");
        t3.setName("ВАЗ");
        t4.setName("vw");

        t1.setModel("lc200");
        t2.setModel("bluebird");

        t1.setName(String.valueOf(Models.TOYOTA));

        System.out.print("1");
        System.out.print("2");
        System.out.print("3");
        System.out.print("3");
        System.out.print("3");
        System.out.print("3");
        System.out.print("3");
        System.out.print("3");
        System.out.print("3");
        System.out.print("3");
        System.out.print("3");
        System.out.print("3");
        System.out.print("3");
        System.out.print("3");
        System.out.print("3");
        System.out.print("3");
        System.out.print("3");
        System.out.print("3");
        System.out.println("3");
        System.out.print("4");









        //t1.getEngine().start();
        t2.getEngine().start();

        //t1.gazEngine.start();
        //t1.dizelEngine.stop();

        if (t2.isStatus()) {System.out.println(t2.getName()+"запущен");} else {System.out.println(t2.getName()+"остановлен");}
        if (t2.getEngine().getStatus()) {System.out.println(t2.getName()+"запущен");} else {System.out.println(t2.getName()+"остановлен");}
    }
}



