package Enum.enummap;

class Plant {
    //每年一次，永久的，两年一次
    enum LifeCycle{ANNIAL, PERENNIAL, BIENNIAL}

    final String name;
    final LifeCycle lifeCycle;

    Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {

    }
}
