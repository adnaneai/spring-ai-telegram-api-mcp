package net.ainouni.mcpserver.tools;

import org.springframework.ai.mcp.annotation.McpArg;
import org.springframework.ai.mcp.annotation.McpTool;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class McpTools {
    @McpTool(name = "getEmployee",
            description = "Get information about a given employee")
    public Employee getEmployee(@McpArg(description = "The amployee name") String name) {
        return new Employee(name,12300,4);
    }

    @McpTool(description = "Get All Employees")
    public List<Employee> getAllEmployees(){
        return List.of(
                new Employee("Adnane",12300,4),
                new Employee("Hamza",38000,6),
                new Employee("Sami",43000,5));
    }
}

record Employee(String name,double salary,int seniority){

}
