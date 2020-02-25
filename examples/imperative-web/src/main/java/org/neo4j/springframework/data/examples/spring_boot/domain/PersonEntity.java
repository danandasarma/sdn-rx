/*
 * Copyright (c) 2019-2020 "Neo4j,"
 * Neo4j Sweden AB [https://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.neo4j.springframework.data.examples.spring_boot.domain;

import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;

/**
 * @author Gerrit Meier
 */
@Node("Person")
public class PersonEntity {

	@Id
	private final String name;

	private Integer born;

	public PersonEntity(Integer born, String name) {
		this.born = born;
		this.name = name;
	}

	public Integer getBorn() {
		return born;
	}

	public void setBorn(Integer born) {
		this.born = born;
	}

	public String getName() {
		return name;
	}
}
