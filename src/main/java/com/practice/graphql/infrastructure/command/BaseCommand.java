package com.practice.graphql.infrastructure.command;

import an.awesome.pipelinr.Command;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
public class BaseCommand<T> implements Command<T> {

    public Integer useId;

    public String username;

    public Collection<String> roles;
}
