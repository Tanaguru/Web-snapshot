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
package org.tanaguru.websnapshot.webapp.controller;

import org.tanaguru.websnapshot.entity.Image;
import org.tanaguru.websnapshot.entity.Image.Status;

/**
 *
 * @author alingua
 */
public class JsonImage {

    private Image image;

    public JsonImage(Image image) {
        this.image = image;
    }

    public Long getId() {
        return image.getId();
    }

    public int getHeight() {
        return image.getHeight();
    }

    public int getWidth() {
        return image.getWidth();
    }

    public Status getStatus() {
        return image.getStatus();
    }

    public String getDateOfCreation() {
        return image.getDateOfCreation().toString();
    }

    public String getUrl() {
        return image.getUrl().getUrl();
    }

    public boolean getIsCanonical() {
        return image.getIsCanonical();
    }
}