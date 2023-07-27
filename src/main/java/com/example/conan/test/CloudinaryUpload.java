package com.example.conan.test;

import com.cloudinary.*;
import com.cloudinary.utils.ObjectUtils;

import java.util.Map;

public class CloudinaryUpload {
    public static void main(String[] args) throws Exception {

        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dmp12tzl2",
                "api_key", "359895688453243",
                "api_secret", "-0r36b5H9D_N5E7OJ5p_ENJFmQQ"));


        Map map = cloudinary.uploader().upload("D:\\works\\conan\\Deebot T9_1.jpg",
                ObjectUtils.asMap("use_filename", true, "unique_filename", false,
                        "folder", "home/huy", "resource_type", "image"));
        System.out.println(map.toString());
    }
}
