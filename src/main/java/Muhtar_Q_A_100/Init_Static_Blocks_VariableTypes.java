package Muhtar_Q_A_100;

public class Init_Static_Blocks_VariableTypes {

    public static int globalVariable;
    public int instanceVariable;

    public static void mStatic(){
      //  instanceVariable = 1;         // compile error.
      //  static int localStatic = 0;   // compile error.
      //  private int accessMod = 1;    // compile error.
        int local = 0;

        System.out.println("globalVariable = " + globalVariable);
      //  mStatic();        // StackOverflowError
    }

    public void mInstance(){
        globalVariable = 0;
        instanceVariable = 1;
        //  static int localStatic = 0;   // compile error.
        //  private int accessMod = 1;    // compile error.
        int local = 0;
    }


    // init block
    {
        globalVariable = 10;
        instanceVariable = 10;
        int initVariable;
    }

    // static block
    static {
        globalVariable = 5;
    //    instanceVariable = 15;     // compile error.
        int staticInit = 5;
    }

    public static void main(String[] args) {
        mStatic();  // 5

        Init_Static_Blocks_VariableTypes test = new Init_Static_Blocks_VariableTypes();
        mStatic();  // 10
    }

}
