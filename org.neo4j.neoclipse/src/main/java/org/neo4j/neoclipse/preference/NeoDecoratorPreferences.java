/*
 * Licensed to "Neo Technology," Network Engine for Objects in Lund AB
 * (http://neotechnology.com) under one or more contributor license agreements.
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership. Neo Technology licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License
 * at (http://www.apache.org/licenses/LICENSE-2.0). Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.neo4j.neoclipse.preference;

/**
 * Defines the preferences of the neo plugin.
 * @author Peter H&auml;nsgen
 * @author Anders Nawroth
 */
public final class NeoDecoratorPreferences
{
    /**
     * Preventing instantiation.
     */
    private NeoDecoratorPreferences()
    {
        // preventing instantiation
    }

    public static final String DATABASE_LOCATION = "databaseLocation";
    /**
     * The property to view inside nodes in the graph view.
     */
    public static final String NODE_PROPERTY_NAMES = "nodePropertyNames";
    /**
     * The property to view inside nodes in the graph view.
     */
    public static final String RELATIONSHIP_PROPERTY_NAMES = "relPropertyNames";
    /**
     * The location of icons for the nodes.
     */
    public static final String NODE_ICON_LOCATION = "iconLocation";
    /**
     * The property to use for icon names.
     */
    public static final String NODE_ICON_PROPERTY_NAMES = "nodeIconPropertyNames";
}