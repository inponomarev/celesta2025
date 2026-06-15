package ru.inponomarev.backend.controller;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import ru.inponomarev.backend.dto.ItemDTO;
import ru.inponomarev.backend.dto.OrderDTO;

import java.util.List;

public interface Api {
    @GET(value = "hello")
    Call<String> hello();

    @POST(value = "order")
    @Headers("Content-Type: application/json")
    Call<OrderDTO> syncPlayerActivities(@Body OrderDTO request);

    @POST(value = "order")
    Call<OrderDTO> postOrder(@Body OrderDTO request);

    @GET(value = "item")
    Call<List<ItemDTO>> getAllItems();
}
