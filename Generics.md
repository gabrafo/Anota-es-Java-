# Generics

Generics permitem que classes, interfaces e métodos possam ser parametrizados por tipo. Seus benefícios são:

- Reuso
- Type safety
- Performance

**Uso comum:** Coleções.

**Exemplo:** Lista (coleção) é parametrizada com o uso de Generics e armazena apenas elementos do tipo String.

```java
List<String> list = new ArrayList<>();
list.add("Maria");
String name = list.get(0);
```

## Como fazer uso de Generics?

**R:** Com o uso da notação < ApelidoQualquer >, definindo que a classe afetada pelo uso de Generics pode efetuar as operações descritas sem a necessidade de definirmos um tipo. Essa definição virá no programa principal, onde ele será especificado durante a instanciação de um objeto dessa classe. A partir do momento que o tipo for especificado no programa principal, o compilador garantirá a Type Safety de operações envolvendo essa coleção. Além disso, a classe, por ser genérica, poderá ser reutilizada para muitos outros fins.

**Exemplos:**

```java
// Instanciação no programa principal
PrintService<Integer> ps = new PrintService<>();
```

```java
// Classe genérica
public class PrintService<Type> { // <Type> generaliza o tipo da classe  
    private List<Type> list = new ArrayList<>(); // <Integer> é um generic  
  
    public void addValue(Type value){  
        list.add(value);  
    }  
  
    public Type first(){  
        if(list.isEmpty()){  
            throw new RuntimeException("List is empty");  
        }  
        return list.getFirst();  
    }  
  
    public void print(){  
        System.out.print("[");  
        if(!list.isEmpty()){  
            System.out.println(list.getFirst()); // list.getFirst() é o mesmo que list.get(0)  
        }  
        for(int i=1; i<list.size(); i++){  
            System.out.print(", " + list.get(i));  
        }  
        System.out.println("]");  
    }  
}
```

### Tipos curinga

Podemos usar também < ? > ao invés de < T >, a diferença é que no primeiro o tipo da variável é inferido durante o tempo de execução e no segundo o tipo **deve** ser delimitado em algum momento no programa.

``` java
List<?> myObjs = new ArrayList<Object>();
List<Integer> myNumbers = new ArrayList<Integer>();
myObjs = myNumbers;
```

Com tipos curinga, podemos criar métodos com qualquer tipo, generalizando operações envolvendo, por exemplo, a impressão de valores no console.

```java
public class Program {  
    public static void main(String[] args) {  
        // Tipo curinga <?>  
        List<Integer> listInt = Arrays.asList(1, 2, 3);  
        printList(listInt);  
  
        List<String> listString = Arrays.asList("A", "B", "C");  
        printList(listString);  
    }  
  
    public static void printList(List<?> list) {  
        for (Object o : list) {  
            System.out.println(o);  
        }  
    }
}
```

**OBS:** Não se pode **adicionar** itens a listas que recebem um genérico de "qualquer tipo".
