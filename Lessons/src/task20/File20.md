Исправила все рекомендации линтера в Task177 и Task18.

Нашла следующие проблемы:

• **Define and throw a dedicated exception instead of using a generic one.**

В методе необходимо было выбросить конкретное исключение, не `Exception` , а `IOException`.

• **Remove this hard-coded path-delimiter.**

Нужно было вынесла в константу знак “/”, так как он используется в нескольких местах.

**• **Rename this local variable to match the regular expression '^[a-z][a-zA-Z0-9]*$'.****

Имя переменной `my_Fil` следовало написать без нижнего подчеркивания.

**• **Rename this package name to match the regular expression '^[a-z_]+(\.[a-z_][a-z0-9_]*)*$'.****

Данную проблему пока не удалось решить, прочла правила для инициализации папок, учла,
что имя пакета нужно писать с маленькой буквы, раньше писала с большой, эту ошибку исправила, но линтер по-прежнему просит переименовать папку.

**• **Save and re-use this "Random".****

Random вынесла в локальную переменную.

**• **Iterate over the "entrySet" instead of the "keySet".****

Переименовала `map.keySet()` на `map.entrySet()` и вместе с тем пришлось у entry вызывать методы getValue и getKey.

Было:
```java
for (Integer key : map.KeySet()){
        if(map.get(key)>=N)
            result.add(key);
}
```
Стало:
```java
for (Integer key : map.KeySet()) {
    if (map.get(key) >= N)
        result.add(key);
}
```
**• **Replace this use of System.out by a logger.****

`System.out.println(i)` исправила на `Logger.getAnonymousLogger().log(Level.INFO, i)`

**• **The return type of this method should be an interface such as "List" rather than the implementation "ArrayList".****

Возвращаемым типом должен быть List, а не ArrayList.

Было:
```java
public ArrayList<Integer> generateList(){
    ArrayList <Integer> array = new ArrayList<>();
…
}
```
Стало:
```java
public List<Integer> generateList(){
    List <Integer> array = new ArrayList<>();
…
}
```
**• **The return type of this method should be an interface such as "List" rather than the implementation "ArrayList".****

Было:
```java
public static ArrayList<Integer> search(ArrayList<Integer> values, int N){
    ArrayList <Integer> result = new ArrayList<>();
…
}
```
Стало:
```java
public static ArrayList<Integer> search(ArrayList<Integer> values, int N){
    ArrayList <Integer> result = new ArrayList<>();
…
}
```
****• The type of "values" should be an interface such as "List" rather than the implementation "ArrayList".****

Было:
```java
public static ArrayList<Integer> search(ArrayList<Integer> values, int N){
    ArrayList <Integer> result = new ArrayList<>();
…
}
```
Стало:
```java
public static ArrayList<Integer> search(List<Integer> values, int N){
    ArrayList <Integer> result = new ArrayList<>();
…
}
```
****• Rename this local variable to match the regular expression '^[a-z][a-zA-Z0-9]*$'.****

Было:
```java
public static ArrayList<Integer> search(List<Integer> values, int N){
    ArrayList <Integer> result = new ArrayList<>();
…
}
```
Стало:
```java
public static ArrayList<Integer> search(List<Integer> values, int number){
    ArrayList <Integer> result = new ArrayList<>();
…
}
```

****• Rename this package name to match the regular expression '^[a-z_]+(\.[a-z_][a-z0-9_]*)*$'.****

Переименовала пакет Task18 на task18, но линтер по-прежнему просит его переименовать.

**• Replace this "Map.get()" and condition with a call to "Map.computeIfAbsent()".**

Данную рекомендацию не удалось реализавать, так как не знакома с анонимными классами и лямбда-выражениями.