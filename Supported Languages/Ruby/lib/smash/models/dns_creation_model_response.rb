# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # DNSCreationModelResponse Model.
  class DNSCreationModelResponse < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :domain

    # TODO: Write general description for this method
    # @return [NameserversModel]
    attr_accessor :nameservers

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['domain'] = 'domain'
        @_hash['nameservers'] = 'nameservers'
      end
      @_hash
    end

    def initialize(domain = nil,
                   nameservers = nil,
                   additional_properties = {})
      @domain = domain
      @nameservers = nameservers

      # Add additional model properties to the instance.
      additional_properties.each do |_name, value|
        instance_variable_set("@#{_name}", value)
      end
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      domain = hash['domain']
      nameservers = NameserversModel.from_hash(hash['nameservers']) if
        hash['nameservers']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      DNSCreationModelResponse.new(domain,
                                   nameservers,
                                   hash)
    end
  end
end
