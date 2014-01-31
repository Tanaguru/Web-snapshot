/*
 * Web-Snapshot
 * Copyright (C) 2008-2014  Open-S Company
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: open-s AT open-s DOT com
 */
package org.opens.websnapshot.webapp.controller;

import org.opens.websnapshot.entity.Thumbnail;

/**
 *
 * @author alingua
 */
public class JsonThumbnail {

    private Thumbnail thumbnail;

    public JsonThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Long getId() {
        return thumbnail.getId();
    }

    public int getHeight() {
        return thumbnail.getHeight();
    }

    public int getWidth() {
        return thumbnail.getWidth();
    }
}