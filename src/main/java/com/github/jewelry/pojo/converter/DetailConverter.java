//package com.github.jewelry.pojo.converter;
//
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.github.jewelry.pojo.bo.DetailBO;
//import lombok.RequiredArgsConstructor;
//import lombok.SneakyThrows;
//
//import javax.persistence.AttributeConverter;
//import javax.persistence.Converter;
//import java.util.Map;
//
///**
// * @author 石少东
// * @date 2020-07-02 13:31
// * @since 1.0
// */
//
//@Converter(autoApply = true)
//@RequiredArgsConstructor
//public class DetailConverter implements AttributeConverter<Map<String, DetailBO>, String> {
//
//    private final ObjectMapper objectMapper;
//
//    @SneakyThrows
//    @Override
//    public String convertToDatabaseColumn(Map<String, DetailBO> attribute) {
//        return objectMapper.writeValueAsString(attribute);
//    }
//
//    @SneakyThrows
//    @Override
//    public Map<String, DetailBO> convertToEntityAttribute(String dbData) {
//        return objectMapper.readValue(dbData, new TypeReference<Map<String, DetailBO>>() {
//        });
//    }
//
//}
