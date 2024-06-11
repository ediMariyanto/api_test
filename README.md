pertama install library library pada gradle
 * implementation ("com.google.code.gson:gson:2.10.1")
 * implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
 * implementation ("com.squareup.retrofit2:retrofit:2.6.2")
 * implementation ("com.squareup.okhttp3:logging-interceptor:4.9.0")

add permission internet pada mainfest.xml
*     <uses-permission android:name="android.permission.INTERNET"/> // untuk memberikan permission internet pada device

buat model dari response API, gunanya untuk memparsing dari json kedalam Object kotlinnya
 * hasil generate dari response API https://jsonplaceholder.typicode.com/users, kemudian jsonnya di convert menggunakan generator online https://www.json2kt.com/, setelah itu menghasilkan 4 kelas dicopy kedalam package / folder model.

note : 
* perhatikan kelas kelas yang ada didalam package/folder API, disana kelas kelas untuk mengkonfig retrofitnya.
* kelas HomeViewModel, hanya opsi saja jika sudah membuat project dengan clean arsitektur MVVM (Model View ViewModel ) wajib menggunakan kelas dan folder tersebut, jika tidak langsung saja di taro di activity atau fragment.
  
