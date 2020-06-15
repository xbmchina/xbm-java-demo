package cn.xbmchina;


import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Test2 {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        initData(vehicles);

//        vehicles.forEach(vehicle -> System.out.println(vehicle));
        //这样就可以遍历打印
//        vehicles.forEach(System.out::println);

//        Map<String,Integer> map = new HashMap<>();
//        map.put("a",1);map.put("b",2);map.put("c",3);
//        map.forEach((k,v) -> System.out.println("key:"+k+",value:"+ v));

        // 取出所有的车架号列表
//        List<String> vins = vehicles.stream().map(Vehicle::getVin).collect(Collectors.toList());
//        vins.forEach(System.out::println);

        // 按照公司 Id 进行分组
//        Map<Integer, List<Vehicle>> companyVehicles = vehicles.stream().collect(Collectors.groupingBy(Vehicle::getCompanyId));
//        // 按照公司分组求司机打分和
//        Map<Integer, Double> collect = vehicles.stream().collect(Collectors.groupingBy(Vehicle::getCompanyId, Collectors.summingDouble(Vehicle::getScore)));


        // 单列排序
//        vehicles.sort((v1, v2) -> v2.getScore().compareTo(v1.getScore()));

// 或使用 Comparator 类来构建比较器，流处理不会改变原列表，需要接收返回值才能得到预期结果
//        List<Vehicle> collect = vehicles.stream().sorted(Comparator.comparing(Vehicle::getScore).reversed()).collect(Collectors.toList());

//// 多列排序，score 降序，companyId 升序排列
//        List<Vehicle> collect = vehicles.stream().sorted(Comparator.comparing(Vehicle::getScore).reversed()
//                .thenComparing(Comparator.comparing(Vehicle::getCompanyId)))
//                .collect(Collectors.toList());

        // 查出所有车绑定的所有设备
//        List<String> collect = vehicles.stream().map(vehicle -> {
//            String deviceNos = vehicle.getDeviceNos();
//            return StringUtils.split(deviceNos,',');
//        }).flatMap(Arrays::stream).collect(Collectors.toList());

// 对所有司机的总分求和
        Double reduce = vehicles.stream().parallel().map(Vehicle::getScore).reduce(0d, Double::sum);

        // 总的分值
        Double totalScore = vehicles.stream().parallel().map(Vehicle::getScore).reduce(0d, Double::sum);

// 查看每一个司机占的分值比重
        List<String> collect = vehicles.stream()
                .mapToDouble(vehicle -> vehicle.getScore() / totalScore)
                .mapToLong(weight -> (long) (weight * 100))
                .mapToObj(percentage -> percentage + "%")
                .collect(Collectors.toList());

    }

    private static void initData(List<Vehicle> vehicles) {
        List<String> imeis = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            List<String> singleVehicleDevices = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                String imei = "sadfsdf" + j;
                singleVehicleDevices.add(imei);
            }
            imeis.add(StringUtils.join(singleVehicleDevices, ","));
        }
        vehicles.add(new Vehicle("KPTSOA1K67P081452", "17620411498", "9420", 1, 4.5, imeis.get(0)));
        vehicles.add(new Vehicle("KPTCOB1K18P057071", "15073030945", "张玲", 2, 1.4, imeis.get(1)));
        vehicles.add(new Vehicle("KPTS0A1K87P080237", "19645871598", "sanri1993", 1, 3.0, imeis.get(2)));
        vehicles.add(new Vehicle("KNAJC526975740490", "15879146974", "李种", 1, 3.9, imeis.get(3)));
        vehicles.add(new Vehicle("KNAJC521395884849", "13520184976", "袁绍", 2, 4.9, imeis.get(4)));
    }
}
