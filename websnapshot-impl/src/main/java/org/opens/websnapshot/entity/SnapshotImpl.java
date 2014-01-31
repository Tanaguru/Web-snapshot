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
package org.opens.websnapshot.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alingua
 */
@Entity
@Table(name = "snapshot")
@XmlRootElement
public class SnapshotImpl implements Snapshot, Serializable {

    private static final int HASH_NUMBER = 5;
    private static final int HASH_COEFFICIENT = 67;
    
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @OneToOne
    @JoinColumn(name = "id_image")
    private ImageImpl image;
    @Column(name = "url")
    private String url;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name = "date_of_creation")
    private Date dateOfCreation;
    @Column(name = "width")
    private Long width;
    @Column(name = "height")
    private Long height;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Image getImage() {
        return image;
    }

    @Override
    public void setImage(Image image) {
        this.image = (ImageImpl) image;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public Date getDateOfCreation() {
        return (Date) dateOfCreation.clone();
    }

    @Override
    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = (Date) dateOfCreation.clone();
    }

    @Override
    public Long getWidth() {
        return width;
    }

    @Override
    public void setWidth(Long width) {
        this.width = width;
    }

    @Override
    public Long getHeight() {
        return height;
    }

    @Override
    public void setHeight(Long height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SnapshotImpl other = (SnapshotImpl) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = HASH_NUMBER;
        hash = HASH_COEFFICIENT * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }
}