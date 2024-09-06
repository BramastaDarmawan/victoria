# Asset 
##### {
    "id": String,
    "name_pemilik": String,
    "nama_barang": String,
    "jumlah": int,
    "jenis_barang": String
    
}

# Create
## /users
### Method : Post
#### Request Body
##### {
    "id": String,
    "name_pemilik": String,
    "nama_barang": String,
    "jumlah": int,
    "jenis_barang": String
}

#### Response Body
##### {
    "id": String,
    "message": String
}

# Read
## /users/id
### Method : Get
#### Response Body
##### {
    "id": String,
    "name_pemilik": String,
    "nama_barang": String,
    "jumlah": int,
    "jenis_barang": String
}

# Update
## /users/id
### Method : Put
#### Request Body
##### {
    "id": String,
    "name_pemilik": String,
    "nama_barang": String,
    "jumlah": int,
    "jenis_barang": String
}
#### Response Body
##### {
    "id": String,
    "message": String
}

# Delete
## /users/id
### Method : Delete
#### Response Body
##### {
    "id": String,
    "message": String
}