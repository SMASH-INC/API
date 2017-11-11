# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # DNSConfigurationModel Model.
  class DNSConfigurationModel < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :key

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :uid

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :domain

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :records

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['key'] = 'key'
        @_hash['uid'] = 'uid'
        @_hash['domain'] = 'domain'
        @_hash['records'] = 'records'
      end
      @_hash
    end

    def initialize(key = nil,
                   uid = nil,
                   domain = nil,
                   records = nil,
                   additional_properties = {})
      @key = key
      @uid = uid
      @domain = domain
      @records = records

      # Add additional model properties to the instance.
      additional_properties.each do |_name, value|
        instance_variable_set("@#{_name}", value)
      end
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      key = hash['key']
      uid = hash['uid']
      domain = hash['domain']
      records = hash['records']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      DNSConfigurationModel.new(key,
                                uid,
                                domain,
                                records,
                                hash)
    end
  end
end
