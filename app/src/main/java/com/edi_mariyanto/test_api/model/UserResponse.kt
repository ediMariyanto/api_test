package com.example.example

import com.google.gson.annotations.SerializedName // TODO : jika error pada import ini, install library GSON

// hasil generate dari response API https://jsonplaceholder.typicode.com/users
// , kemudian jsonnya di convert menggunakan generator online https://www.json2kt.com/,
// setelah itu menghasilkan 4 kelas dicopy kedalam package / folder model.
data class UserResponse (

  @SerializedName("id"       ) var id       : Int?     = null,
  @SerializedName("name"     ) var name     : String?  = null,
  @SerializedName("username" ) var username : String?  = null,
  @SerializedName("email"    ) var email    : String?  = null,
  @SerializedName("address"  ) var address  : Address? = Address(),
  @SerializedName("phone"    ) var phone    : String?  = null,
  @SerializedName("website"  ) var website  : String?  = null,
  @SerializedName("company"  ) var company  : Company? = Company()

)