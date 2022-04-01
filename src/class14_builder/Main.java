package class14_builder;

/**
 * Desc:建造者模式
 * @author zzs
 * @date 2022/4/1 19:21
 */
public class Main {
    public static void main(String[] args) {

        TerrainBuilder builder = new ComplexTerrainBuilder();
        Terrain t = builder.buildFort().buildMine().buildWall().build();

        // 不想用哪个属性就注释掉
        Person p = new Person.PersonBuilder()
                .basicInfo(1, "zhangsan", 18)
                .score(20)
                .weight(200)
                //.loc("bj", "23")
                .build();
    }
}
