package com.codingapi.maven.uml.define;

import com.codingapi.maven.uml.annotation.AggregationRootModel;
import com.codingapi.maven.uml.annotation.GraphRelation;
import com.codingapi.maven.uml.annotation.Title;
import lombok.Data;

import java.util.List;

@AggregationRootModel(title = "模型定义")
@Data
public class ModelDefinition {
    private String packageName;

    private String className;

    @GraphRelation(value = ".right.>")
    @Title("模型注释")
    private ModelAnnotation annotation;

    @GraphRelation(".left.>")
    private List<FieldDefinition> fieldDefinitions;

    @GraphRelation(".down.>")
    private List<MethodDefinition> methodDefinitions;

    @GraphRelation(".left.>")
    private List<RelationDefinition> relationDefinitions;

    @Title("模型转字符串")
    public String string() {
        return toString();
    }

}
