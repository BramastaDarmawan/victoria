package com.example.first_application.Response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class GetAssetResponse {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("jumlah")
    private int jumlah;
    @JsonProperty("full_name")
    private String fullname;
    @JsonProperty("nama_barang")
    private String nama_barang;
}
