package com.github.gradusnikov.eclipse.assistai.model;

import java.util.List;

/**
 * Descriptor for MCP Server configuration
 */
public record McpServerDescriptor( String uid, 
                                   String name, 
                                   String command, 
                                   List<EnvironmentVariable> environmentVariables, 
                                   boolean enabled, 
                                   boolean builtIn )
{
    public enum Status {NOT_CONNECTED, RUNNING, FAILED};
    public record EnvironmentVariable( String name, String value ) {};
}