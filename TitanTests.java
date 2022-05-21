import org.junit.jupiter.api.Test;
import titans.ArmoredTitan;
import static org.junit.jupiter.api.Assertions.*;

public class TitanTests {
    // TODOg

    ArmoredTitan armoredTitan = ArmoredTitan.create();

    public static void main(String[] args) {
        ArmoredTitan armoredTitan = ArmoredTitan.create();
        System.out.println(armoredTitan.getChestOrgan().getHp());
        System.out.println(armoredTitan.getChestOrgan().takeDamage(200000));
        System.out.println(armoredTitan.getChestOrgan().getHp());
     System.out.println(armoredTitan.getLeftArmOrgan().getHp());
        System.out.println(armoredTitan.getLeftArmOrgan().takeDamage(200));
        System.out.println(armoredTitan.getLeftArmOrgan().getHp());
        System.out.println(armoredTitan.getRightArmOrgan().getHp());
        System.out.println(armoredTitan.getRightArmOrgan().takeDamage(50));
        System.out.println(armoredTitan.getRightArmOrgan().getHp());
        System.out.println(armoredTitan.getFaceOrgan().getHp());
        System.out.println(armoredTitan.getFaceOrgan().takeDamage(7));
        System.out.println(armoredTitan.getFaceOrgan().getHp());
        System.out.println(armoredTitan.getRightFootOrgan().getHp());
        System.out.println(armoredTitan.getRightFootOrgan().takeDamage(90));
        System.out.println(armoredTitan.getRightFootOrgan().getHp());
        System.out.println(armoredTitan.getLeftFootOrgan().getHp());
        System.out.println(armoredTitan.getLeftFootOrgan().takeDamage(35));
        System.out.println(armoredTitan.getLeftFootOrgan().getHp());
        System.out.println(armoredTitan.getRightLegOrgan().getHp());
        System.out.println(armoredTitan.getRightLegOrgan().takeDamage(57));
        System.out.println(armoredTitan.getRightLegOrgan().getHp());
        System.out.println(armoredTitan.getLeftLegOrgan().getHp());
        System.out.println(armoredTitan.getLeftLegOrgan().takeDamage(34));
        System.out.println(armoredTitan.getLeftLegOrgan().getHp());
        System.out.println(armoredTitan.getNeckOrgan().getHp());
        System.out.println(armoredTitan.getNeckOrgan().takeDamage(22));
        System.out.println(armoredTitan.getNeckOrgan().getHp());
        System.out.println(armoredTitan.getStomachOrgan().getHp());
        System.out.println(armoredTitan.getStomachOrgan().takeDamage(61));
        System.out.println(armoredTitan.getStomachOrgan().getHp());
    }

    @Test
    public void HP() {
        assertEquals(210 , armoredTitan.getChestOrgan().getHp());
        armoredTitan.getChestOrgan().takeDamage(20);
        assertEquals(208.36, armoredTitan.getChestOrgan().getHp());
        assertEquals(80.0, armoredTitan.getLeftArmOrgan().getHp());
        armoredTitan.getLeftArmOrgan().takeDamage(200);
        assertEquals(21.18, armoredTitan.getLeftArmOrgan().getHp());
        assertEquals(80.0 , armoredTitan.getRightArmOrgan().getHp());
        armoredTitan.getRightArmOrgan().takeDamage(50);
        assertEquals(65.29, armoredTitan.getRightArmOrgan().getHp());
        assertEquals(30.0, armoredTitan.getFaceOrgan().getHp());
        armoredTitan.getFaceOrgan().takeDamage(7);
        assertEquals(26.11, armoredTitan.getFaceOrgan().getHp());
        assertEquals(45.0 , armoredTitan.getRightFootOrgan().getHp());
        armoredTitan.getRightFootOrgan().takeDamage(90);
        assertEquals(34.02, armoredTitan.getRightFootOrgan().getHp());
        assertEquals(45.0 , armoredTitan.getLeftFootOrgan().getHp());
        armoredTitan.getLeftFootOrgan().takeDamage(35);
        assertEquals(40.73, armoredTitan.getLeftFootOrgan().getHp());
        assertEquals(55.0 , armoredTitan.getRightLegOrgan().getHp());
        armoredTitan.getRightLegOrgan().takeDamage(57);
        assertEquals(50.25, armoredTitan.getRightLegOrgan().getHp());
        assertEquals(55.0 , armoredTitan.getLeftLegOrgan().getHp());
        armoredTitan.getLeftLegOrgan().takeDamage(34);
        assertEquals(52.17, armoredTitan.getLeftLegOrgan().getHp());
        assertEquals(45.0 , armoredTitan.getNeckOrgan().getHp());
        armoredTitan.getNeckOrgan().takeDamage(22);
        assertEquals(34.52, armoredTitan.getNeckOrgan().getHp());
        assertEquals(50.0 , armoredTitan.getStomachOrgan().getHp());
        armoredTitan.getStomachOrgan().takeDamage(61);
        assertEquals(44.55, armoredTitan.getStomachOrgan().getHp());
    }
    @Test
    public void  ArmorTest(){
        assertTrue(armoredTitan.getChestOrgan().getArmor().takeDamage(176));
        assertFalse(armoredTitan.getChestOrgan().takeDamage(10000000));
        assertTrue(armoredTitan.getLeftArmOrgan().getArmor().takeDamage(186));
        assertFalse(armoredTitan.getLeftArmOrgan().takeDamage(6794866));
        assertTrue(armoredTitan.getRightArmOrgan().getArmor().takeDamage(100));
        assertFalse(armoredTitan.getRightArmOrgan().takeDamage(8668866));
        assertTrue(armoredTitan.getFaceOrgan().getArmor().takeDamage(15));
        assertFalse(armoredTitan.getFaceOrgan().takeDamage(11100));
        assertTrue(armoredTitan.getRightFootOrgan().getArmor().takeDamage(101));
        assertFalse(armoredTitan.getRightFootOrgan().takeDamage(25643));
        assertTrue(armoredTitan.getLeftFootOrgan().getArmor().takeDamage(75));
        assertFalse(armoredTitan.getLeftFootOrgan().takeDamage(765577));
        assertTrue(armoredTitan.getRightLegOrgan().getArmor().takeDamage(87));
        assertFalse(armoredTitan.getRightLegOrgan().takeDamage(86543));
        assertTrue(armoredTitan.getLeftLegOrgan().getArmor().takeDamage(50));
        assertFalse(armoredTitan.getLeftLegOrgan().takeDamage(67654));
        assertTrue(armoredTitan.getNeckOrgan().getArmor().takeDamage(30));
        assertFalse(armoredTitan.getNeckOrgan().takeDamage(109870));
        assertTrue(armoredTitan.getStomachOrgan().getArmor().takeDamage(76));
        assertFalse(armoredTitan.getStomachOrgan().takeDamage(7658));
    }
}
