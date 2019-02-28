package com;


/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
  /*  @Test
    public void shouldAnswerWithTrue() {
        Map<Object,Object> map = new HashMap<>();
        Triangle t = new Triangle(2,3);
        Triangle t1 = new Triangle(2,3);
        map.put(t,"demo");
        String a = "a";
        String b = "a";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        map.put(new String("abc"),"abc");

        System.out.println(map.get(new String("abc")));
        *//*Map<String,Object> map = new HashMap<>();
        for(int i=0;i<4;i++){
            map.put(i+"",4);
        }
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyyMMddHH");//设置日期格式
        String newsNo = "xw"+ LocalDateTime.now().format(fmt);
        System.out.print(newsNo);

        List<String> list= Arrays.asList("1" ,"a","2","dd","b");
        *//**//**
         * Collect这里有三个参数，分别是：(生成一个容器,也是返回的容器，如何往容器中添加元素，如何往容器中添加容器中的元素)。
         *
         *//**//*
        ArrayList<String> aList=list.stream().collect(() -> new ArrayList<String>(),
                (lista,b) -> lista.add(b),
                (lista, listb) -> lista.addAll(listb));
        aList.forEach((a)->System.out.println(a));*//*

        }

        @Test
       public void setInstance(){
            //HashSet 无序
            System.out.println("--------HashSet 无序--------");
            Set<String> hashSet = new HashSet<>();
            hashSet.add("set1");
            hashSet.add("set2");
            hashSet.add("set3");
            hashSet.add("set4");
            hashSet.add("set5");
            hashSet.forEach(System.out::println);

            //LinkedHashSet 添加顺序
            System.out.println("--------LinkedHashSet 添加顺序--------");
            Set<String> linkedHashSet = new LinkedHashSet<>();
            linkedHashSet.add("set5");
            linkedHashSet.add("set4");
            linkedHashSet.add("set3");
            linkedHashSet.add("set2");
            linkedHashSet.add("set1");
            linkedHashSet.forEach(System.out::println);

            //TreeSet 自然顺序
            System.out.println("--------TreeSet 自然顺序--------");
            Set<String> treeSet = new TreeSet<>();
            treeSet.add("set2");
            treeSet.add("set1");
            treeSet.add("set4");
            treeSet.add("set3");
            treeSet.add("set5");
            treeSet.forEach(System.out::println);
        }

        @Test
        public void tranisentExample() throws Exception {

            Triangle triangle = new Triangle(2,3);
            System.out.println("1.初始化对象\n"+triangle);
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("triangle"));

            // 转换为流写入对象
            o.writeObject(triangle);
            o.close();

            // 从流读取对象
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("triangle"));
            Triangle triangle1 = (Triangle)in.readObject();
            System.out.println("2.反序列化后的对象\n"+triangle1);
            triangle1.setArea();
            System.out.println("3.恢复成原始对象\n"+triangle1);
            in.close();
        }

        @Test
        public void StringText() throws NoSuchFieldException, IllegalAccessException {
            String str = "one two";
            System.out.println(str); // one two

            Field field = String.class.getDeclaredField("value");
            field.setAccessible(true);

            char[] value = (char[])field.get(str);
            value[4] = 'o';
            value[5] = 'n';
            value[6] = 'e';

            System.out.println(str); // one one

        }*/
}
