package it.Team3.PCBuilder.models;

import it.Team3.PCBuilder.IsCompatibleWith;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Gpu")
public class Gpu extends Component implements IsCompatibleWith {
    @Id
    @GeneratedValue
    private int id;
    private String manufacturer;
    private String partNumber;
    private String chipset;
    private int memorySizeGB;
    private String memoryType;
    private int coreClockMHz;
    private int boostClockMHz;
    private int effectiveMemoryClockMHz;
    private String interfaceType;
    private int lengthMM;
    private int tdpWatt;

    public Gpu() {
    }

    public Gpu(int id, double price, String manufacturer,
               String partNumber, String chipset, int memorySizeGB,
               String memoryType, int coreClockMHz, int boostClockMHz,
               int effectiveMemoryClockMHz, String interfaceType, int lengthMM, int tdpWatt) {
        super(id, price);
        this.manufacturer = manufacturer;
        this.partNumber = partNumber;
        this.chipset = chipset;
        this.memorySizeGB = memorySizeGB;
        this.memoryType = memoryType;
        this.coreClockMHz = coreClockMHz;
        this.boostClockMHz = boostClockMHz;
        this.effectiveMemoryClockMHz = effectiveMemoryClockMHz;
        this.interfaceType = interfaceType;
        this.lengthMM = lengthMM;
        this.tdpWatt = tdpWatt;
    }

    @Override
    public String toString() {
        return "Gpu details:" +
                "\nManufacturer: " + manufacturer +
                "\nPart Number: " + partNumber +
                "\nChipset: " + chipset +
                "\nMemory Size (GB): " + memorySizeGB +
                "\nMemory Type: " + memoryType +
                "\nCore Clock (MHz): " + coreClockMHz +
                "\nBoost Clock (MHz): " + boostClockMHz +
                "\nEffective Memory Clock (MHz): " + effectiveMemoryClockMHz +
                "\nInterface Type: " + interfaceType +
                "\nLength (mm): " + lengthMM +
                "\nTDP (Watt): " + tdpWatt + "\n";
    }

    @Override
    public boolean isCompatibleWith(Component component) {
        return false;
    }
}