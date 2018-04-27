/*
 * Licensed to DuraSpace under one or more contributor license agreements.
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 *
 * DuraSpace licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fcrepo.spec.testsuite.test;

/**
 * @author Daniel Bernstein
 */
public class Constants {

    private Constants() {

    }

    public static final String BASIC_CONTAINER_BODY = "@prefix ldp: <http://www.w3.org/ns/ldp#> ."
                                                + "@prefix dcterms: <http://purl.org/dc/terms/> ."
                                                + "<> a ldp:Container, ldp:BasicContainer;"
                                                + "dcterms:title 'Container class Container' ;"
                                                + "dcterms:description " +
                                                      "'This is a test container for the Fedora API Test Suite.' . ";

}
