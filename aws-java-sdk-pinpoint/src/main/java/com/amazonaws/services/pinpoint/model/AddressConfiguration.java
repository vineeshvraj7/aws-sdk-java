/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Address configuration.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddressConfiguration implements Serializable, Cloneable, StructuredPojo {

    /** Body override. If specified will override default body. */
    private String bodyOverride;
    /**
     * The channel type.
     * 
     * Valid values: GCM | APNS | SMS | EMAIL
     */
    private String channelType;
    /**
     * A map of custom attributes to attributes to be attached to the message for this address. This payload is added to
     * the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
     */
    private java.util.Map<String, String> context;
    /** The Raw JSON formatted string to be used as the payload. This value overrides the message. */
    private String rawContent;
    /**
     * A map of substitution values for the message to be merged with the DefaultMessage's substitutions. Substitutions
     * on this map take precedence over the all other substitutions.
     */
    private java.util.Map<String, java.util.List<String>> substitutions;
    /** Title override. If specified will override default title if applicable. */
    private String titleOverride;

    /**
     * Body override. If specified will override default body.
     * 
     * @param bodyOverride
     *        Body override. If specified will override default body.
     */

    public void setBodyOverride(String bodyOverride) {
        this.bodyOverride = bodyOverride;
    }

    /**
     * Body override. If specified will override default body.
     * 
     * @return Body override. If specified will override default body.
     */

    public String getBodyOverride() {
        return this.bodyOverride;
    }

    /**
     * Body override. If specified will override default body.
     * 
     * @param bodyOverride
     *        Body override. If specified will override default body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressConfiguration withBodyOverride(String bodyOverride) {
        setBodyOverride(bodyOverride);
        return this;
    }

    /**
     * The channel type.
     * 
     * Valid values: GCM | APNS | SMS | EMAIL
     * 
     * @param channelType
     *        The channel type.
     * 
     *        Valid values: GCM | APNS | SMS | EMAIL
     * @see ChannelType
     */

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    /**
     * The channel type.
     * 
     * Valid values: GCM | APNS | SMS | EMAIL
     * 
     * @return The channel type.
     * 
     *         Valid values: GCM | APNS | SMS | EMAIL
     * @see ChannelType
     */

    public String getChannelType() {
        return this.channelType;
    }

    /**
     * The channel type.
     * 
     * Valid values: GCM | APNS | SMS | EMAIL
     * 
     * @param channelType
     *        The channel type.
     * 
     *        Valid values: GCM | APNS | SMS | EMAIL
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public AddressConfiguration withChannelType(String channelType) {
        setChannelType(channelType);
        return this;
    }

    /**
     * The channel type.
     * 
     * Valid values: GCM | APNS | SMS | EMAIL
     * 
     * @param channelType
     *        The channel type.
     * 
     *        Valid values: GCM | APNS | SMS | EMAIL
     * @see ChannelType
     */

    public void setChannelType(ChannelType channelType) {
        withChannelType(channelType);
    }

    /**
     * The channel type.
     * 
     * Valid values: GCM | APNS | SMS | EMAIL
     * 
     * @param channelType
     *        The channel type.
     * 
     *        Valid values: GCM | APNS | SMS | EMAIL
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public AddressConfiguration withChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
        return this;
    }

    /**
     * A map of custom attributes to attributes to be attached to the message for this address. This payload is added to
     * the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
     * 
     * @return A map of custom attributes to attributes to be attached to the message for this address. This payload is
     *         added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event
     *         attributes.
     */

    public java.util.Map<String, String> getContext() {
        return context;
    }

    /**
     * A map of custom attributes to attributes to be attached to the message for this address. This payload is added to
     * the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
     * 
     * @param context
     *        A map of custom attributes to attributes to be attached to the message for this address. This payload is
     *        added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event
     *        attributes.
     */

    public void setContext(java.util.Map<String, String> context) {
        this.context = context;
    }

    /**
     * A map of custom attributes to attributes to be attached to the message for this address. This payload is added to
     * the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
     * 
     * @param context
     *        A map of custom attributes to attributes to be attached to the message for this address. This payload is
     *        added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event
     *        attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressConfiguration withContext(java.util.Map<String, String> context) {
        setContext(context);
        return this;
    }

    public AddressConfiguration addContextEntry(String key, String value) {
        if (null == this.context) {
            this.context = new java.util.HashMap<String, String>();
        }
        if (this.context.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.context.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Context.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressConfiguration clearContextEntries() {
        this.context = null;
        return this;
    }

    /**
     * The Raw JSON formatted string to be used as the payload. This value overrides the message.
     * 
     * @param rawContent
     *        The Raw JSON formatted string to be used as the payload. This value overrides the message.
     */

    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    /**
     * The Raw JSON formatted string to be used as the payload. This value overrides the message.
     * 
     * @return The Raw JSON formatted string to be used as the payload. This value overrides the message.
     */

    public String getRawContent() {
        return this.rawContent;
    }

    /**
     * The Raw JSON formatted string to be used as the payload. This value overrides the message.
     * 
     * @param rawContent
     *        The Raw JSON formatted string to be used as the payload. This value overrides the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressConfiguration withRawContent(String rawContent) {
        setRawContent(rawContent);
        return this;
    }

    /**
     * A map of substitution values for the message to be merged with the DefaultMessage's substitutions. Substitutions
     * on this map take precedence over the all other substitutions.
     * 
     * @return A map of substitution values for the message to be merged with the DefaultMessage's substitutions.
     *         Substitutions on this map take precedence over the all other substitutions.
     */

    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * A map of substitution values for the message to be merged with the DefaultMessage's substitutions. Substitutions
     * on this map take precedence over the all other substitutions.
     * 
     * @param substitutions
     *        A map of substitution values for the message to be merged with the DefaultMessage's substitutions.
     *        Substitutions on this map take precedence over the all other substitutions.
     */

    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * A map of substitution values for the message to be merged with the DefaultMessage's substitutions. Substitutions
     * on this map take precedence over the all other substitutions.
     * 
     * @param substitutions
     *        A map of substitution values for the message to be merged with the DefaultMessage's substitutions.
     *        Substitutions on this map take precedence over the all other substitutions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressConfiguration withSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        setSubstitutions(substitutions);
        return this;
    }

    public AddressConfiguration addSubstitutionsEntry(String key, java.util.List<String> value) {
        if (null == this.substitutions) {
            this.substitutions = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.substitutions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.substitutions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Substitutions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressConfiguration clearSubstitutionsEntries() {
        this.substitutions = null;
        return this;
    }

    /**
     * Title override. If specified will override default title if applicable.
     * 
     * @param titleOverride
     *        Title override. If specified will override default title if applicable.
     */

    public void setTitleOverride(String titleOverride) {
        this.titleOverride = titleOverride;
    }

    /**
     * Title override. If specified will override default title if applicable.
     * 
     * @return Title override. If specified will override default title if applicable.
     */

    public String getTitleOverride() {
        return this.titleOverride;
    }

    /**
     * Title override. If specified will override default title if applicable.
     * 
     * @param titleOverride
     *        Title override. If specified will override default title if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressConfiguration withTitleOverride(String titleOverride) {
        setTitleOverride(titleOverride);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBodyOverride() != null)
            sb.append("BodyOverride: ").append(getBodyOverride()).append(",");
        if (getChannelType() != null)
            sb.append("ChannelType: ").append(getChannelType()).append(",");
        if (getContext() != null)
            sb.append("Context: ").append(getContext()).append(",");
        if (getRawContent() != null)
            sb.append("RawContent: ").append(getRawContent()).append(",");
        if (getSubstitutions() != null)
            sb.append("Substitutions: ").append(getSubstitutions()).append(",");
        if (getTitleOverride() != null)
            sb.append("TitleOverride: ").append(getTitleOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddressConfiguration == false)
            return false;
        AddressConfiguration other = (AddressConfiguration) obj;
        if (other.getBodyOverride() == null ^ this.getBodyOverride() == null)
            return false;
        if (other.getBodyOverride() != null && other.getBodyOverride().equals(this.getBodyOverride()) == false)
            return false;
        if (other.getChannelType() == null ^ this.getChannelType() == null)
            return false;
        if (other.getChannelType() != null && other.getChannelType().equals(this.getChannelType()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        if (other.getRawContent() == null ^ this.getRawContent() == null)
            return false;
        if (other.getRawContent() != null && other.getRawContent().equals(this.getRawContent()) == false)
            return false;
        if (other.getSubstitutions() == null ^ this.getSubstitutions() == null)
            return false;
        if (other.getSubstitutions() != null && other.getSubstitutions().equals(this.getSubstitutions()) == false)
            return false;
        if (other.getTitleOverride() == null ^ this.getTitleOverride() == null)
            return false;
        if (other.getTitleOverride() != null && other.getTitleOverride().equals(this.getTitleOverride()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBodyOverride() == null) ? 0 : getBodyOverride().hashCode());
        hashCode = prime * hashCode + ((getChannelType() == null) ? 0 : getChannelType().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode + ((getRawContent() == null) ? 0 : getRawContent().hashCode());
        hashCode = prime * hashCode + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
        hashCode = prime * hashCode + ((getTitleOverride() == null) ? 0 : getTitleOverride().hashCode());
        return hashCode;
    }

    @Override
    public AddressConfiguration clone() {
        try {
            return (AddressConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.AddressConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
