package unit9GenericsInDepth.C5;

public class GenericMultipleTypeParameters {
    public static void main(String[] args) {
        Bin<String, Integer> bin = new Bin<>();
        bin.setDryTrash("gdhfgdhfgdsgh");
        bin.setWetTrash(746587);
        System.out.println("Dry Trash: " + bin.getDryTrash() + ", Wet Trash: " + bin.getWetTrash());
    }
}
