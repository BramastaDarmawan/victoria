## Multiple Choice
1. B
2. A
3. D
4. C
5. D

## True/False
6. False
7. True
8. True
9. True
10. True

## Short Answer
11. Untuk tempat menghandle endpoint, seperti get, put, post, dan delete
12. service berinteraksi dengan menggunakan function yang sudah disediakan di repository
13. Paling bawah adalah entity, folder yang berisikan kelas yang digunakan untuk mengakses tabel di dalam database. Repository menghandle database operasinya. Service tempat dibuatnya logicnya berdasarkan hasil dari operasi yang ada di repository. Controller tempat untuk menjalankan segala service termasuk inputannya
14. Repository itu digunakan untuk menjalankan seluruh operas sql yang ddibutuhkan
15. Implicit digunakan untuk melakukan casting secara otomatis terhadap tipe data yang lebih kecil jika ingin diubah ke tipe data yang lebih besar, contohnya dari int ke double. Sedangkan Explicit digunakan untuk melakukan casting secara manual terhadap tipe data yang lebih besar jika ingin diubah ke tipe data yang lebih kecil, contohnya dari double ke int.
16. tambahkan dependecies untuk JWT terlebih dahulu, kemudian baru membuat kelas JWT utilitynya, baru melakukan konfigurasi dengan bantuan anotasi @EnableSecurity
17. double MyDouble = parseDouble("23.56");
system.out.println(MyDouble);
18. Untuk mencocokan hasil dari test, dengan output yang diharapkan
19. Membuat entity user dan mendefinisikan role dari user tersebut, kemudian membuat repository layer untuk user, dan membuat service untuk userDetailService, setelah itu baru melakukan custom filter untuk menyesuaikan dengan kebutuhan yang diuser
20. @Service digunakan pada kelas yang melakukan implementasi interface kelas interface service sedangkan di kelas interface service ditambahkan @Component
21. service layer bertugas untuk membuat seluruh logic program, sehingga di bagian controller hanya menjalankan function dari service saja
22. Membuat kelas test khusus untuk service, dengan customisasi yang disesuaikan dengan service
23. melakukan mapping request HTTP dari controller sehingga dapat mengakses seluruh fuction yang ada didalam requestan
24. menyiapkan kelas khusus untuk melakukan test integrasi kelas service dan kelas repository, dengan berbagai macam input yang sesuai dengan method dan fuction didalamnya
25. Menampilkan kode error serta pesan error