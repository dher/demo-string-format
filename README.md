# demo-string-format

Code:
```java
String text = "Hello %s, today the weather is %s";

String nama = "derry";
String cuaca = "rainy";

String result = String.format(text, nama, cuaca);
System.out.println(result);
```

result:
```
Hello derry, today the weather is rainy
```
