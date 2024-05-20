public class test {
    String Name;
    String Sound;

    //constutructor
    //syntax of constructor = classname +(pass attributes) + { this.attributeName = attributeName; }

    Aniamalmal(String Name,String Sound){
        this.Name = Name;
        this.Sound = Sound;
    }
//method
    //sntax of method = return type = method Name = {} = {}

    //Run
    //eat

    void Run  (){
        System.out.println("Animal can Run");
    }
    void eat(){
        System.out.println("Animal can eat");
    }

    void info(){
        System.out.println();
        System.out.println("Animal Name  = "+Name);
        System.out.println("Animal Sound = "+Sound);
    }
}

}
