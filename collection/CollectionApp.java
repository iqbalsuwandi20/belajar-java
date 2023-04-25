// package collection;

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.List;

// /**
//  * Collection
//  */
// public class CollectionApp {
//     public static void main(String[] args) {

//         Collection<String> collection = new ArrayList<>();

//         /**
//          * Menambah Data
//          */
//         collection.add("Iqbal");
//         collection.add("Suwandi");
//         collection.add("Steven");
//         collection.addAll(List.of("Programmer", "Zaman", "Now"));

//         for (var value : collection) {
//             System.out.println(value);
//         }

//         /**
//          * Menghapus Data
//          */
//         collection.remove("Steven");
//         collection.removeAll(List.of("Zaman", "Now"));

//         for (var value : collection) {
//             System.out.println(value);
//         }

//         /**
//          * Mengecek Data
//          */
//         System.out.println(
//             collection.contains("iqbal")
//         );

//         System.out.println(
//             collection.containsAll(List.of("Suwandi", "Programmer"))
//         );

//     }
// }
