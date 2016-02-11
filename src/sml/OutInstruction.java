package sml;


public class OutInstruction extends Instruction{

    private int op1;

    public OutInstruction(String label, String op) {
        super(label, op);
    }

    public OutInstruction(String label, int op1){
        this(label, "out");
        this.op1 = op1;
    }





    @Override
    public void execute(Machine m){
        System.out.println(m.getRegisters().getRegister(op1));


    }

    @Override
    public String toString() {
        return super.toString() + " " + op1;


    }



}
