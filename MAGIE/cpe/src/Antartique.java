interface OiseauVolant {
    int voler();
}

interface OiseauVolantNageur extends OiseauVolant {
    int voler();
    int nager();
}

abstract class Antartique extends Object implements OiseauVolantNageur {
    protected int i;

    public Antartique(int j) {
        super();
        this.i = j;
    }
    public Antartique(){}

    public static void main(String[] oiseaux) {

        Antartique t = new Tete();
        System.out.println(t.voler());
        System.out.println(t.nager());
    }
}

class Tete extends Antartique {
    private int i;

    public Tete() {
        this.i = 2;
    }

    public int voler() {
        return this.i;
    }

    public int nager() {
        return super.i;
    }
}