package functionalprogramming.lamada;

interface Description {
    String brief();
}

interface Body {
    String detailed(String head);
}

interface Multi {
    String twoArg(String head, Double d);
}

public class LambdaExpressions {

    static Body bod = h -> h + " No Parens!"; // [1]

    static Body bod2 = (h) -> h + " More details"; // [2]

    static Description desc = () -> "Short info"; // [3]

    static Multi mult = (h, n) -> h + n; // [4]

    static Description moreLines = () -> { // [5]
        System.out.println("moreLines()");
        return "from moreLines()";
    };

    public static void main(String[] args) {
        System.out.println(bod.detailed("Oh!"));
        System.out.println(bod2.detailed("Hi!"));
        System.out.println(desc.brief());
        System.out.println(mult.twoArg("Pi! ", 3.14159));
        System.out.println(moreLines.brief());
    }
}
/*
任何 Lambda 表达式的基本语法是：
参数。
接着 ->，可视为“产出”。
-> 之后的内容都是方法体。
[1] 当只用一个参数，可以不需要括号 ()。 然而，这是一个特例。
[2] 正常情况使用括号 () 包裹参数。 为了保持一致性，也可以使用括号 () 包裹单个参数，虽然这种情况并不常见。
[3] 如果没有参数，则必须使用括号 () 表示空参数列表。
[4] 对于多个参数，将参数列表放在括号 () 中。
到目前为止，所有 Lambda 表达式方法体都是单行。 该表达式的结果自动成为 Lambda 表达式的返回值，在此处使用 return 关键字是非法的。 这是 Lambda 表达式缩写用于描述功能的语法的另一种方式。
[5] 如果在 Lambda 表达式中确实需要多行，则必须将这些行放在花括号中。 在这种情况下，就需要使用 return。
Lambda 表达式通常比匿名内部类产生更易读的代码*/
