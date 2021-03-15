package java基础;

public class 深浅拷贝 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();

        //引用拷贝，地址相同
        User newUser = user;
        System.out.println(user);
        System.out.println(newUser);



        //对象拷贝
        User user1 = (User) user.clone();//如果实体类没实现cloneable接口会报异常
        System.out.println(user1);
        System.out.println(user);

        System.out.println("---------");

        //浅拷贝
        //两个引用student1和student2指向不同的两个对象，
        // 但是两个引用student1和student2中的两个teacher引用指向的是同一个对象，
        // 所以说明是浅拷贝。深拷贝也就是两个teacher引用指向的不是一个对象
        Teacher teacher = new Teacher();
        teacher.setName("Delacey");
        teacher.setAge(29);

        Student student1 = new Student();
        student1.setName("Dream");
        student1.setAge(18);
        student1.setTeacher(teacher);

        Student Student = (Student) student1.clone();
        System.out.println("拷贝后");
        System.out.println(Student.getName());
        System.out.println(Student.getAge());
        System.out.println(Student.getTeacher().getName());
        System.out.println(Student.getTeacher().getAge());
        System.out.println("修改老师的信息后-------------");

        // 修改老师的信息
        teacher.setName("Jam");
        System.out.println(student1.getTeacher().getName());
        System.out.println(Student.getTeacher().getName());

    }

}
