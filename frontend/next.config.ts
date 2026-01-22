import type { NextConfig } from "next";

const nextConfig: NextConfig = {
  /* config options here */
    typescript: {
        ignoreBuildErrors: false,
    },
    output: 'standalone',
};

export default nextConfig;
